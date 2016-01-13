package streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConcat {

	public static void main(String[] args) {
		Stream<String> strings = Stream.of("a", "b", "c", "d");
		System.out.println(strings.reduce("", String::concat));
		
//		System.out.println(strings.collect(
//				() -> new StringBuilder(), 
//				(sb, item) -> sb.append(item), 
//				(sb1, sb2) -> sb1.append(sb2)));
		
		List<Integer> strs = Arrays.asList(1, null, 3, 5, null, 8);
        List<Integer> rtn = strs.parallelStream().filter(num -> num != null)
        		.collect(() -> new ArrayList<Integer>(),
                        (list, item) -> list.add(item),
                        (list1, list2) -> list1.addAll(list2));
        System.out.println(rtn);
        
        List<Integer> rtn2 = strs.parallelStream().filter(num -> num != null).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(rtn2);
        
        List<Integer> rtn3 = strs.parallelStream().filter(num -> num != null).collect(Collectors.toList());
        System.out.println(rtn3);
	}
}
