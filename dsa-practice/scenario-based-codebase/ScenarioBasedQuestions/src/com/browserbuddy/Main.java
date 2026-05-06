package com.browserbuddy;

public class Main {
    public static void main(String[] args) {
        BrowserBuddy browser = new BrowserBuddy();
        Tab tab = browser.getCurrentTab();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        browser.closeTab();
        browser.reopenTab();

        System.out.println("Current Page: " + tab.getCurrentPage());
    }
}
