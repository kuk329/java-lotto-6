package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class WinningNumbers {

    private final Lotto lottoNumber;

    public WinningNumbers(List<Integer> integers) {
        this.lottoNumber = new Lotto(integers);
    }

    public Lotto getLottoNumber() {
        return lottoNumber;
    }
}
