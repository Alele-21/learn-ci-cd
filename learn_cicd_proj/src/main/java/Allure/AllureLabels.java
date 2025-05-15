package Allure;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import io.qameta.allure.model.Label;

import java.util.List;

public class AllureLabels {
    public static void setSuiteName(String expectedName){
        AllureLifecycle lifecycle = Allure.getLifecycle();

        lifecycle.updateTestCase(testResult -> {
            List<Label> labels = testResult.getLabels();

            labels.stream()
                    .filter(label -> "suite".equals(label.getName()))
                    .forEach(label -> label.setValue(expectedName));
        });
    }

    public static void setPackageName(String expectedName){
        AllureLifecycle lifecycle = Allure.getLifecycle();

        lifecycle.updateTestCase(testResult -> {
            List<Label> labels = testResult.getLabels();

            labels.stream()
                    .filter(label -> "package".equals(label.getName()))
                    .forEach(label -> label.setValue(expectedName));
        });
    }

    public static void setTestClassName(String expectedName){
        AllureLifecycle lifecycle = Allure.getLifecycle();

        lifecycle.updateTestCase(testResult -> {
            List<Label> labels = testResult.getLabels();

            labels.stream()
                    .filter(label -> "testClass".equals(label.getName()))
                    .forEach(label -> label.setValue(expectedName));
        });
    }

    public static void setSubSuiteName(String expectedName){
        AllureLifecycle lifecycle = Allure.getLifecycle();

        lifecycle.updateTestCase(testResult -> {
            List<Label> labels = testResult.getLabels();

            if (labels.stream().noneMatch(label -> "subSuite".equals(label.getName()))) {
                labels.add(new Label().setName("subSuite").setValue(expectedName));
            }else{
                labels.stream()
                        .filter(label -> "subSuite".equals(label.getName()))
                        .forEach(label -> label.setValue(expectedName));
            }
        });
    }

    public static void setParentSuiteName(String expectedName){
        AllureLifecycle lifecycle = Allure.getLifecycle();

        lifecycle.updateTestCase(testResult -> {
            List<Label> labels = testResult.getLabels();

            if (labels.stream().noneMatch(label -> "parentSuite".equals(label.getName()))) {
                labels.add(new Label().setName("parentSuite").setValue(expectedName));
            }else{
                labels.stream()
                        .filter(label -> "parentSuite".equals(label.getName()))
                        .forEach(label -> label.setValue(expectedName));
            }
        });
    }

    public static void setTestCaseName(String expectedName) {
        Allure.getLifecycle().updateTestCase(testResult -> {
            testResult.setName(expectedName);
        });
    }

}
