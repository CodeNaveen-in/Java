interface MyIterator {
    boolean hasNext();
    Object next();
}

class LinearList {
    private Object[] data;
    private int size;

    public LinearList(Object[] arr) {
        this.data = arr;
        this.size = arr.length;
    }
    //private inner class 
    private class ArrayIterator implements MyIterator {
        private int position = 0;

        public boolean hasNext() {
            return position < size;
        }

        public Object next() {
            return data[position++];
        }
    }

    public MyIterator getIterator() {
        //MyIterator itr=new ArrayIterator();
        MyIterator itr=new ArrayIterator();

        return itr;
        //return new ArrayIterator();
    }
}


public class T14 {
    public static void main(String[] args) {
        Object[] items = { "Apple", "Banana", "Cherry", "Date" };
        LinearList list = new LinearList(items);
        //interface
        //LinearList.ArrayIterator it =list.getIterator();
        //System.out.println("Class: " + list.getIterator().getClass().getName());
      
        MyIterator it = list.getIterator();
        System.out.println("Class: " + it.getClass().getName());
        while (it.hasNext()) {
            System.out.println("Item: " + it.next());
        }
    }
}

//for(int a:array)
//for(int i=)