package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> list = new ArrayList<>();

    public void add(Account account) {
        list.remove(account);
    }

    public Account get(int index) {
        return list.get(index);
    }

    public void remove(Account account) {
        list.remove(account);
    }

    public void remove(int index) {
        list.remove(index);
    }
}
