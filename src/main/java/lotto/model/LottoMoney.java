package lotto.model;

public class LottoMoney {

    private final int money;

    public LottoMoney(int money) {
        validateUnitFor1000(money);
        this.money = money;
    }

    public void validateUnitFor1000(int money){
        if(money==0 || money%1000 != 0){
            throw new IllegalArgumentException("금액은 1000원 단위로 입력해주세요.");
        }
    }

    public int getMoney() {
        return money;
    }
}
