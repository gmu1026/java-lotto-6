package lotto.model;

import java.util.List;

public class Lotto {
    private static final int NUMBERS_LENGTH = 6;
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != NUMBERS_LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
