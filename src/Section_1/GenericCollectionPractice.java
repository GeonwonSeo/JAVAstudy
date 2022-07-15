package Section_1;
import java.util.*;

import static Section_1.GenericCollectionPractice.*;

class GenericCollectionPractice {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        //TODO..
        if (index > arrayList.size() - 1) return null;
        else {
            arrayList.add(index, element);
            return arrayList;
        }
    }

    public List<String> arrayToArrayList(String[] arr) {
        //TODO..
        List<String> AL = Arrays.asList(arr);
        return arr.length > 0 ? null : AL;
    }

    public static int sumAllElements(ArrayList<Integer> arrayList) {
        //TODO..
        int result = 0;
        ListIterator<Integer> iter = arrayList.listIterator();
        while (iter.hasNext()) { //arrayList.listIterator().hasNext하면 안됨
            result += iter.next();
        }
        return result;
    }

    public HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
        //TODO..
        hashMap.put(key, value);//바로 return 하면 안됨
        return hashMap;
    }

    public static int addOddValues(HashMap<Character, Integer> hashMap) {
        //TODO..
        int result = 0;
        Iterator iter = hashMap.keySet().iterator();
        for (int i = 0; i < hashMap.size(); i++) {
            int a = hashMap.get(iter.next());
            if (a % 2 == 0) result += a;
        }
        return result;
    }

    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        //TODO..
        String fullName;
        fullName = hashMap.get("firstName") + hashMap.get("lastName");
        hashMap.put("fullName", fullName);
        return hashMap;
    }

    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        //TODO..
        if (hashMap.containsKey(key) && hashMap.get(key).size() > index) {
            return hashMap.get(key).get(index);
        } else return null;
    }

    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        //TODO..
        HashMap<String, Integer> nhm = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                nhm.put(arr[i], hashMap.get(arr[i]));
            }
        }
        return nhm;
    }

    public static HashMap<Character, Integer> countAllCharacter(String str) {
        //TODO..
        HashMap<Character, Integer> nhm = new HashMap<Character, Integer>();
        ArrayList<Character> list = new ArrayList<>();
        char[] ca = str.toCharArray();
        for (char i : ca) list.add(i);
        Set<Character> set = new HashSet<>(list);
        int[] count = new int[set.size()];
        ArrayList<Character> list2 = new ArrayList<>(set);
        for (char a : list) {
            for (int i = 0; i < list2.size(); i++) {
                if (a == list2.get(i)) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            nhm.put(list2.get(i), count[i]);
        }
        return nhm.isEmpty() ? null : nhm;
    }
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        //TODO..
        ArrayList<Integer> nfb = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            nfb.add(arrayList.get(i));
        }
        return nfb.isEmpty() ? null : nfb;
    }
}
class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 5, 7));
        System.out.println(sumAllElements(list));
        HashMap<Character, Integer> fruits = new HashMap<>();
        fruits.put('a', 1);
        fruits.put('b', 2);
        fruits.put('c', 3);
        fruits.put('d', 4);
        fruits.put('e', 5);
        System.out.println(addOddValues(fruits));
        System.out.println(countAllCharacter(""));
    }
}


