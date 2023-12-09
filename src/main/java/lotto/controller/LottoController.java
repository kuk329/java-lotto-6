package lotto.controller;

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

    private void getPurchaseMoney(){
        try{
            int money = inputView.requestPurchaseMoney();
            // todo 받은돈 로또머니에 저장.

        }catch (RuntimeException e){
            outputView.printErrorMessage(e.getMessage());
            getPurchaseMoney();
        }

    }
}
