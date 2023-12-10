package lotto.model;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BonusNumberTest {

    @DisplayName("보너스 번호에 로또 번호 범위를 넘어선 숫자가 입력되면 예외가 발생한다.")
    @Test
    void createBonusNumberByOverNumber() {
        Integer number = 46;
        Assertions.assertThatThrownBy(
                        () -> new BonusNumber(number)
                ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("로또 번호는 1부터 45 사이의 숫자여야 합니다.");
    }

}