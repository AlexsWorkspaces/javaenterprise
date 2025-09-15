import java.util.Arrays;

public class Array {
    public static Integer[] arrayCopy(Integer[] source, Integer[] target) {
        for (int i = target.length - 1; i >= 0; i--) {
            if (target[i] != null) {
                int realTargetsLength = i + 1;
                Integer[] result = Arrays.copyOf(target, realTargetsLength + source.length);
                System.arraycopy(source, 0, result, i + 1, source.length);
                return result;
            }
        }
        return source;
    }
}
