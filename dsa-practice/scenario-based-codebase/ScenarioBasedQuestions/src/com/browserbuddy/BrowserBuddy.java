package com.browserbuddy;

import java.util.Stack;

class BrowserBuddy {
    private Stack<Tab> closedTabs = new Stack<>();
    private Tab currentTab = new Tab();

    public Tab getCurrentTab() {
        return currentTab;
    }

    // Close current tab
    public void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new Tab();
        System.out.println("Tab closed");
    }

    // Reopen last closed tab
    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Tab reopened");
        } else {
            System.out.println("No closed tabs to restore");
        }
    }
}
