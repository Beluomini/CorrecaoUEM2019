package tools;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FilteredJList extends JList {

    private FilterField filterField;
    private int DEFAULT_FIELD_WIDTH = 30;

    public FilteredJList(Container container) {
        super();
        
        setModel(new FilterModel());
        filterField = new FilterField(DEFAULT_FIELD_WIDTH);
        setLocale(new Locale("pt","Br"));
    }

    public void setModel(ListModel m) {
        if (!(m instanceof FilterModel)) {
            throw new IllegalArgumentException();
        }
        super.setModel(m);
    }

    public void addItem(Object o) {
        ((FilterModel) getModel()).addElement(o);
    }

    public JTextField getFilterField() {
        return filterField;
    }

   

    // inner class to provide filtered model
    class FilterModel extends AbstractListModel {

        ArrayList items;
        ArrayList filterItems;

        public FilterModel() {
            super();
            items = new ArrayList();
            filterItems = new ArrayList();
        }

        @Override
        public Object getElementAt(int index) {
            if (index < filterItems.size()) {
                return filterItems.get(index);
            } else {
                return null;
            }
        }

        @Override
        public int getSize() {
            return filterItems.size();
        }

        public void addElement(Object o) {
            items.add(o);
            refilter();
        }

        private void refilter() {
            filterItems.clear();
            String term = getFilterField().getText();
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).toString().indexOf(term, 0) != -1) {
                    filterItems.add(items.get(i));
                }
            }
            fireContentsChanged(this, 0, getSize());
        }
    }

    // inner class provides filter-by-keystroke field
    class FilterField extends JTextField implements DocumentListener {

        public FilterField(int width) {
            super(width);
            getDocument().addDocumentListener(this);
        }

        public void changedUpdate(DocumentEvent e) {
            ((FilterModel) getModel()).refilter();
        }

        public void insertUpdate(DocumentEvent e) {
            ((FilterModel) getModel()).refilter();
        }

        public void removeUpdate(DocumentEvent e) {
            ((FilterModel) getModel()).refilter();
        }
    }
}