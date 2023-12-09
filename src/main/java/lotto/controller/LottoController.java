package lotto.controller;

import lotto.model.LottoMoney;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;

    public LottoController(){ // 생성자 생성시 초기화
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }
    public void start(){ // start() 만 public 으로 열어둠.
        getPurchaseMoney();


    }

    private LottoMoney getPurchaseMoney(){
        try{
            int money = inputView.requestPurchaseMoney();
            return new LottoMoney(money);
        }catch (RuntimeException e){
            outputView.printErrorMessage(e.getMessage());
            return getPurchaseMoney();
        }

    }
}
