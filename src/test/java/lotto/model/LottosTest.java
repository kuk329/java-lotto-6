package lotto.model;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottosTest {

    @DisplayName("구입한 개수 만큼 로또 리스트를 생성하는지 확인한다")
    @Test
    void createLottos(){
        int amount =  5;

        Lottos lottos = new Lottos(amount);

        assertThat(lottos.getLottos().size()).isEqualTo(5);
    }

}