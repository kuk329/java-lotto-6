package lotto.model;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        validateDuplicateNumber(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplicateNumber(List<Integer> numbers){
        long count = numbers.stream().distinct().count();
        if(count!=numbers.size()){
            throw new IllegalArgumentException("중복되는 번호가 있습니다.");
        }

    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
