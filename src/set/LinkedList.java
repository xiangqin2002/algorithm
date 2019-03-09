package set;

public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node();
        size = 0;
    }

    // 鑾峰彇閾捐〃涓殑鍏冪礌涓暟
    public int getSize(){
        return size;
    }

    // 杩斿洖閾捐〃鏄惁涓虹┖
    public boolean isEmpty(){
        return size == 0;
    }

    // 鍦ㄩ摼琛ㄧ殑index(0-based)浣嶇疆娣诲姞鏂扮殑鍏冪礌e
    // 鍦ㄩ摼琛ㄤ腑涓嶆槸涓�涓父鐢ㄧ殑鎿嶄綔锛岀粌涔犵敤锛氾級
    public void add(int index, E e){

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");

        Node prev = dummyHead;
        for(int i = 0 ; i < index ; i ++)
            prev = prev.next;

        prev.next = new Node(e, prev.next);
        size ++;
    }

    // 鍦ㄩ摼琛ㄥご娣诲姞鏂扮殑鍏冪礌e
    public void addFirst(E e){
        add(0, e);
    }

    // 鍦ㄩ摼琛ㄦ湯灏炬坊鍔犳柊鐨勫厓绱爀
    public void addLast(E e){
        add(size, e);
    }

    // 鑾峰緱閾捐〃鐨勭index(0-based)涓綅缃殑鍏冪礌
    // 鍦ㄩ摼琛ㄤ腑涓嶆槸涓�涓父鐢ㄧ殑鎿嶄綔锛岀粌涔犵敤锛氾級
    public E get(int index){

        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Illegal index.");

        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++)
            cur = cur.next;
        return cur.e;
    }

    // 鑾峰緱閾捐〃鐨勭涓�涓厓绱�
    public E getFirst(){
        return get(0);
    }

    // 鑾峰緱閾捐〃鐨勬渶鍚庝竴涓厓绱�
    public E getLast(){
        return get(size - 1);
    }

    // 淇敼閾捐〃鐨勭index(0-based)涓綅缃殑鍏冪礌涓篹
    // 鍦ㄩ摼琛ㄤ腑涓嶆槸涓�涓父鐢ㄧ殑鎿嶄綔锛岀粌涔犵敤锛氾級
    public void set(int index, E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Illegal index.");

        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++)
            cur = cur.next;
        cur.e = e;
    }

    // 鏌ユ壘閾捐〃涓槸鍚︽湁鍏冪礌e
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    // 浠庨摼琛ㄤ腑鍒犻櫎index(0-based)浣嶇疆鐨勫厓绱�, 杩斿洖鍒犻櫎鐨勫厓绱�
    // 鍦ㄩ摼琛ㄤ腑涓嶆槸涓�涓父鐢ㄧ殑鎿嶄綔锛岀粌涔犵敤锛氾級
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        Node prev = dummyHead;
        for(int i = 0 ; i < index ; i ++)
            prev = prev.next;

        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size --;

        return retNode.e;
    }

    // 浠庨摼琛ㄤ腑鍒犻櫎绗竴涓厓绱�, 杩斿洖鍒犻櫎鐨勫厓绱�
    public E removeFirst(){
        return remove(0);
    }

    // 浠庨摼琛ㄤ腑鍒犻櫎鏈�鍚庝竴涓厓绱�, 杩斿洖鍒犻櫎鐨勫厓绱�
    public E removeLast(){
        return remove(size - 1);
    }

    // 浠庨摼琛ㄤ腑鍒犻櫎鍏冪礌e
    public void removeElement(E e){

        Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.e.equals(e))
                break;
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();

        Node cur = dummyHead.next;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");

        return res.toString();
    }
}
