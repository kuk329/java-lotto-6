package lotto.controller;

import java.util.List;
import lotto.model.BonusNumber;
import lotto.model.LottoMoney;
import lotto.model.Lottos;
import lotto.model.WinningNumbers;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;

    public LottoController(){ // 생성자 생성시 초기화
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }
    public void start(){
        LottoMoney lottoMoney = getPurchaseMoney();
        Lottos lottos = createLottos(lottoMoney.getCount());
        printLottos(lottos);
        WinningNumbers winningNumbers = createWinningNumbers();
        BonusNumber bonusNumber = createBonusNumber();



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

    private Lottos createLottos(int count){
        try{
            return new Lottos(count);
        }catch (RuntimeException e){
            outputView.printErrorMessage(e.getMessage());
            return createLottos(count);
        }
    }

    private void printLottos(Lottos lottos){
        outputView.printLottoPurchaseCount(lottos.getLottos().size());
        outputView.printLottosNumbers(lottos);

    }

    private WinningNumbers createWinningNumbers(){
        try{
            List<Integer> inputNumbers = inputView.requestWinningNumbers();
            return new WinningNumbers(inputNumbers);

        }catch (RuntimeException e){
            outputView.printErrorMessage(e.getMessage());
           return createWinningNumbers();
        }
    }

    private BonusNumber createBonusNumber(){
        try{
            Integer inputNumber = inputView.requestBonusNumber();
            return new BonusNumber(inputNumber);
        }catch (RuntimeException e){
            outputView.printErrorMessage(e.getMessage());
            return createBonusNumber();
        }
    }







}
