package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 45;
    private final int LOTTO_COUNT = 6;
    private final ArrayList<Lotto> lottos;

    public Lottos(int count) {
        this.lottos = new ArrayList<>();
        createLotto(count);
    }

    private void createLotto(int count){
        for(int i=0; i<count; i++){
            lottos.add(new Lotto(createNumbers()));
        }
    }

    public List<Integer> createNumbers(){
        return Randoms.pickUniqueNumbersInRange(MIN_NUMBER,MAX_NUMBER,LOTTO_COUNT);
    }

    public ArrayList<Lotto> getLottos() {
        return lottos;
    }
}
