package ru.sberbank.school.helloworld.tasks.lesson08.pluginManager.plugins.plugin2;

import ru.sberbank.school.helloworld.tasks.lesson08.pluginManager.Plugin;

public class MyPlugin implements Plugin {
    @Override
    public void doUseful() {
        System.out.println("plugin2");
    }
}