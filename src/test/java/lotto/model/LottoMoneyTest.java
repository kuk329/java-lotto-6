package lotto.model;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottoMoneyTest {

    @DisplayName("로또 금액이 1,000 원 단위가 아닐때 예외가 발생한다.")
    @Test
    void validateUnitFor1000(){
        int money = 900;

        Assertions.assertThatThrownBy(()->{
            new LottoMoney(money);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("금액은 1000원 단위로 입력해주세요.");

    }

    @DisplayName("로또 금액이 0원 일때 예외가 발생한다.")
    @Test
    void validateFor0(){
        int money = 0;

        Assertions.assertThatThrownBy(()->{
                    new LottoMoney(money);
                }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("금액은 1000원 단위로 입력해주세요.");

    }

    @DisplayName("로또 금액을 생성한다.")
    @Test
    void createLottoMoney(){
        int money = 1000;

        LottoMoney lottoMoney = new LottoMoney(money);

        assertThat(lottoMoney.getMoney()).isEqualTo(money);

    }



}