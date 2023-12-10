package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    private final List<LottoNumber> numbers;

    public Lotto(List<Integer> integers) {
        validateLength(integers);
        validateDuplicateNumber(integers);
        this.numbers = changeIntegerToLottoNumber(integers);
    }

    private List<LottoNumber> changeIntegerToLottoNumber(List<Integer> integers) {
        List<LottoNumber> tmpList = new ArrayList<>();
        for (Integer integer : integers) {
            tmpList.add(new LottoNumber(integer));
        }
        return tmpList;
    }

    private void validateLength(List<Integer> integers) {
        if (integers.size() != 6) {
            throw new IllegalArgumentException("로또 번호는 6개만 입력 가능합니다.");
        }
    }

    private void validateDuplicateNumber(List<Integer> integers){
        long count = integers.stream().distinct().count();
        if(count!=integers.size()){
            throw new IllegalArgumentException("중복되는 번호가 있습니다.");
        }

    }

    public List<LottoNumber> getNumbers() {
        return numbers;
    }
}
