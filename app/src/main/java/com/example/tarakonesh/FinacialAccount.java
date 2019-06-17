package com.example.tarakonesh;

/*support telgram id =@javaprogrammer_eh
 * 24/03/1398
 * creted by elmira hossein zadeh*/

public class FinacialAccount {
    private int id;
    private String finacialAccountName;

    public FinacialAccount() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FinacialAccount(String finacialAccountName) {
        this.finacialAccountName = finacialAccountName;
    }

    public String getFinacialAccountName() {
        return finacialAccountName;
    }

    public void setFinacialAccountName(String finacialAccountName) {
        this.finacialAccountName = finacialAccountName;
    }
}
