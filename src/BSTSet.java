public class BSTSet<E extends Comparable<E>> implements Set<E>{
    private BST bst;
    public BSTSet(){
        bst = new BST();
    }

    @Override
    public int getSize(){
        return bst.size();
    }

    @Override
    public boolean isEmpty(){
        return bst.isEmpty();
    }

    @Override
    public void add(E e){
        bst.add(e);
    }

    @Override
    public boolean contains(E e){
        return bst.contains(e);
    }

    @Override
    public void remove(E e){
        bst.remove(e);
    }

    public static void main(String[] args) {
        BST bst1 = new BST();
        System.out.println(bst1.getClass().toString());
    }
}

