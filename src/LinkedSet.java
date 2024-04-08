import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class LinkedSet<E> extends LinkedList<E> {
    private HashSet<E> set;

    public LinkedSet() {
        this.set = new HashSet<E>();
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super E> c) {
        super.sort(c);
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return super.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return super.removeIf(filter);
    }

    @Override
    public Stream<E> stream() {
        return super.stream();
    }

    @Override
    public Stream<E> parallelStream() {
        return super.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        super.forEach(action);
    }
}
