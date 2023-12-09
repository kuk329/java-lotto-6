## 구현할 기능 목록 작성 

- [x] 로또 구입 금액을 입력한다. `InputView>requestPurchaseMoney`
  - [x] 빈값에 대한 예외 처리를 한다. `InputView>validateInputEmpty`
  - [x] 숫자인지에 대한 예외 처리를 한다. `InputView>validateNumeric`
  - [x] 금액은 LottoMoney 클래스에 저장한다. `LottoMoney`
    - [x] 금액이 1,000 단위인지에 대한 예외처리를 한다. `LottoMoney>validateUnitFor1000`
- [ ] 구입한 금액만큼 로또를 생성한다.
- [ ] 생성한 로또 번호를 출력한다.
- [ ] 당첨 번호 6개를 입력받는다.
  - [ ] 입력에 대한 예외 처리를 한다.
- [ ] 보너스 번호 한개를 입력한다.
  - [ ] 입력에 대한 예외 처리를 한다.
- [ ] 당첨에 대한 통계를 출력한다.
- [ ] 총 수익률을 출력한다. 