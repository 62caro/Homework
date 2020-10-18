package hw_07_10_2020.hw_3;

public class ValidateDataCard {

    public static void DataValidate(String numCard, int typeC, String cardHold, String expDate, String cvvCode) {

        class Data {
            private String numberCard;
            private int typeCard;
            private String cardHolder;
            private String expiryDate;
            private String cvv;

            public Data() {
                this.numberCard = numCard;
                this.typeCard = typeC;
                this.cardHolder = cardHold;
                this.expiryDate = expDate;
                this.cvv = cvvCode;
            }

            public String getNumberCard() {
                return numberCard;
            }

            public void setNumberCard(String numberCard) {
                this.numberCard = numberCard;
            }

            public int getTypeCard() {
                return typeCard;
            }

            public void setTypeCard(int typeCard) {
                this.typeCard = typeCard;
            }

            public String getCardHolder() {
                return cardHolder;
            }

            public void setCardHolder(String cardHolder) {
                this.cardHolder = cardHolder;
            }

            public String getExpiryDate() {
                return expiryDate;
            }

            public void setExpiryDate(String expiryDate) {
                this.expiryDate = expiryDate;
            }

            public String getCVV() {
                return cvv;
            }

            public void setCVV(String cvv) {
                this.cvv = cvv;
            }

            public void validate() {
                if (numCard.length() == 16 || !checkString(numberCard)) {
                    System.out.println("Валидация номера карты прошла успешно");
                } else System.out.println("Номер карты не соответствует формату");
                if (typeC == 1) {
                    System.out.println("Карта являтся дебетовой");
                } else System.out.println("Карта являтся кредитной");
                if (cardHold.isEmpty()) {
                    System.out.println("Карта без владельца");
                } else System.out.println("Владелец " + cardHold);
                if (cvv.length() != 3 || !checkString(cvv)) {
                    System.out.println("CVV не соответствует формату");
                } else System.out.println("CVV соответствует формату");
            }
            public boolean checkString(String string) {
                if (string == null) return false;
                return string.matches("^-?\\d+$");
            }

        }

        Data dataValidate = new Data();
        dataValidate.validate();

    }


}
