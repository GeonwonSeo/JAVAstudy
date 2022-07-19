package Section_1;
import java.lang.reflect.Member;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class LambdaStreamPractice {
    int computeSumOfAllElements(List<Integer> list) {
        //TODO..
        List<Integer> numbers = list;
        int sum =
                numbers.stream()
                        .mapToInt(number -> number)
                        .sum();
        return sum;
    }

    double computeAverageOfNumbers(List<Integer> list) {
        //TODO..
        double avg = list.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
        return avg;
    }

    List<Integer> filterOddNumbers(List<Integer> list) {
        //TODO..
        List<Integer> fon = list.stream()
                .filter(d -> d % 2 == 0)
                .collect(Collectors.toList());
        return fon;
    }

    long computeCountOfFemaleMember(List<Member> members) {
        //구현된 Member 클래스의 getName(), getGender() 메소드로 해당 Member 클래스의 name, gender를 확인할 수 있습니다.
        //TODO..
        long ccfm = members.stream()
                .filter(m -> Objects.equals(m.getGender(), "Female"))
                .count();
        return ccfm;

    }

    static class Member {
        String name;
        String gender;
        int age;

        Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        String getName() {
            return name;
        }

        String getGender() {
            return gender;
        }

        int getAge() {
            return age;
        }

        double computeAverageOfMaleMember(List<Member> members) {
            //구현된 Member 클래스의 getName(), getGender(), getAge() 메소드로 해당 Member 클래스의 name, gender, age를 확인할 수 있습니다.
            //TODO..
            double caomm = members.stream()
                    .filter(m -> m.getGender().equals("Male"))
                    .mapToDouble(Member::getAge)
                    .average()
                    .orElse(0);
            return caomm;
        }

        String[] makeUniqueNameArray(List<String> names) {
            //TODO..
            String[] muna = names.stream()
                    .distinct()
                    .sorted()
                    .toArray(String[]::new);
            return muna;
        }

        String[] filterName(List<String> names) {
            //TODO..
            String[] fn = names.stream()
                    .distinct()
                    .sorted()
                    .filter(m -> m.startsWith("김"))
                    .toArray(String[]::new);
            return fn;
        }

        List<String> mergeTwoStream(List<String> list1, List<String> list2) {
            //TODO..
            List<String> mts = Stream.concat(list1.stream(), list2.stream())
                    .collect(Collectors.toList());
            return mts;
        }

        List<String> findPeople(List<String> male, List<String> female, String lastName) {
            //TODO..
            List<String> fp = Stream.concat(male.stream(), female.stream())
                    .distinct()
                    .sorted()
                    .filter(m -> m.startsWith(lastName))
                    .collect(Collectors.toList());
            return fp;
        }

        boolean isHot(int[] temperature) {
            //TODO..
            long ih = Arrays.stream(temperature)
                    .filter(m -> m > 30)
                    .count();
            return ih > 3;
        }

        public List<Integer> makeElementDouble(List<Integer> list) {
            //TODO..
            List<Integer> med = list.stream()
                    .map(x -> x * 2)
                    .collect(Collectors.toList());
            return med;
        }

        public int findLongestLength(String[] strArr) {
            //TODO..
            int fll = Stream.of(strArr)
                    .map(m -> m.length())
                    .max(Integer::compare)
                    .orElse(0);
            return fll;
        }

        public Integer findBiggestNumber(int[] arr) {
            //TODO..
            if (arr.length == 0) {
                return null;
            }
            int fbg = Arrays.stream(arr)
                    .max()
                    .orElse(0);
            return fbg;
        }
    }
}
