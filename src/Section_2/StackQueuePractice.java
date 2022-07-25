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
  public int paveBox(Integer[] boxes) {
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
}
class QueuePractice2 {
  public int queuePrinter(int bufferSize, int capacities, int[] documents) {
    // TODO:
    
  }
}


