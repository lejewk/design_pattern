package iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("next()를 한번도 호출하지 않았따면 삭제할수없습니다.");
        }

        if (items[position-1] != null) {
            for (int i = position-1; i < items.length-1; i++) {
                items[i] = items[i + 1];
            }
            items[items.length-1] = null;
        }
    }
}
