package lesson170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary implements Iterable<Dictionary.Pair>{
    private static final int MAX = 10;

    @Override
    public Iterator<Pair> iterator() {
        return new Iterator<Pair>() {
            
            int currentElement;
            Iterator<Pair> listIterator = null;

            @Override
            public boolean hasNext() {
                if(listIterator!= null && listIterator.hasNext()){
                    return true;
                }
                listIterator = null;
                currentElement++;
                for (++currentElement;listIterator == null && currentElement < data.length; currentElement++) {
                    List<Pair> list = data[currentElement];
                    listIterator = list.iterator();
                    if (list == null) {
                        continue;
                    }
                    listIterator = list.iterator();
                    if (!listIterator.hasNext()){
                        continue;
                    }
                    else{
                        return false;
                    }
                }

                return false;
            }

            @Override
            public Pair next() {
                if (!hasNext()){
                    throw new IllegalArgumentException();
                }
                return listIterator.next();
            }
        };
    }


    public static class Pair {

        String key;
        String value;

        public Pair(String key, String value) {

            this.key = key;
            this.value = value;

        }
    }

    List<Pair>[] data = new List[MAX];

    public void put(String key, String value) {
        int index = hash(key);
//        List <String> list= data[index];
//        if (list == null) {
//            list = new ArrayList<>();
//            data[index] = list;
//        }

        if (data[index] == null) {
            data[index] = new ArrayList<>();
        }

        Pair pair = getPair(key);
        if (pair == null) {
            data[index].add(new Pair(key, value));
            return;
        }
        pair.value=value;

    }

    private int hash(String key) {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }

    public String get(String key) {
        Pair pair = getPair(key);
        return pair == null ? null : pair.value;
    }

    private Pair getPair(String key) {
        int index = hash(key);
        List<Pair> list = data[index];
        if (list == null) {
            return null;
        }
        for (Pair pair :
                list) {
            if (pair.key.equals(key))
                return pair;
        }
        return null;
    }
}
