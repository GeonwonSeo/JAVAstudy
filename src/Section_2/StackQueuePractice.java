package Section_2;

import java.util.*;

class StackQueuePractice {
  public ArrayList<Stack> browserStack(String[] actions, String start) {
    Stack<String> prevStack = new Stack<>();
    Stack<String> nextStack = new Stack<>();
    Stack<String> current = new Stack<>();
    ArrayList<Stack> result = new ArrayList<>();
    // TODO:
    current.add(start);
    for (String i : actions) {
      if (i == "-1") {
        if (prevStack.size() ==0) continue;
        nextStack.add(current.pop());
        current.add(prevStack.pop());
      } else if (i == "1") {
        if (nextStack.size() == 0) continue;
        prevStack.add(current.pop());
        current.add(nextStack.pop());
      }
        else {
          prevStack.add(current.pop());
          current.add(i);
          nextStack.clear();
        }
      } result.add(prevStack);
    result.add(current);
    result.add(nextStack);
    return result;
    }
  }

class QueuePractice {
  int paveBox(Integer[] boxes) {
    // TODO:
    int length = 0, max = boxes[0], count = 0;

    for (int box : boxes) {
      if (box > max) {
        max = box;
        count = 1;
      } else {
        count += 1;
      }
      if (count > length) length = count;
    }
    return length;
  }
  int paveBox2(Integer[] boxes) {
    ArrayList<Integer> answer =new ArrayList<>();
    //배열 -> 리스트
    List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(boxes));
    while(arrayList.size() >0) {
      for (int i = 0; i < arrayList.size(); i++) { //answer이 arraylist.size보다 클경우 더 돌릴 필요없긴함.
        if (arrayList.get(0)<arrayList.get(i)) {
          answer.add(i);
          arrayList = arrayList.subList(i, arrayList.size());
          break;
        }
        if (i == arrayList.size()-1) {
          answer.add(arrayList.size());
          arrayList.clear();
        }
      }
    }
    int result = 0;
    for (int i = 0; i < answer.size(); i++) {
      if (result < answer.get(i)) result = answer.get(i);
    } return result;
  }
}

class QueuePractice3 {
  int queuePrinter(int bufferSize, int capacities, int[] documents) {
    // TODO:
    int count = 0;
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < bufferSize; i++) {
      queue.add(0);
    }
    queue.poll();
    queue.add(documents[0]);
    documents = Arrays.copyOfRange(documents, 1, documents.length);
    count++;

    while (documents.length != 0 || (queue.stream().reduce(0, Integer::sum) != 0)) {
      if (documents.length != 0) {
        int sum = queue.stream().reduce(0, Integer::sum) + documents[0];
        if (sum > capacities) {
          queue.poll();
          sum = queue.stream().reduce(0, Integer::sum) + documents[0];

            if (sum <= capacities) {
              queue.add(documents[0]);
              documents = Arrays.copyOfRange(documents, 1, documents.length);
              count++;
            } else {
              queue.add(0);
              count++;
            }
          } else {
            queue.poll();
            queue.add(documents[0]);
            documents = Arrays.copyOfRange(documents, 1, documents.length);
            count++;
          }
        } else {
            queue.poll();
            queue.add(0);
            count++;
        }
      } return count;
    }
  int queuePrinter4(int bufferSize, int capacities, int[] documents) {
    Queue<Integer> queue = new LinkedList<>();
    int count = 0;
    return count;
  }
}





