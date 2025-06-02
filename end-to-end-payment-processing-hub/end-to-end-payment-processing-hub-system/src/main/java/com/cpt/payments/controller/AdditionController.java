package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class AdditionController {

    @PostMapping("/add")
    public int add(@RequestParam int num1, @RequestParam int num2) {
        System.out.println("num1:" + num1 + "|num2:" + num2);
        int sumResult = num1 + num2;
        System.out.println("sumResult:" + sumResult);
        return sumResult;
    }


    @PostMapping("/operation1")
    public int operation1(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 1");
        int result = (a + b) * 1 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 1: " + result);
        return result;
    }
    

    @PostMapping("/operation2")
    public int operation2(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 2");
        int result = (a + b) * 2 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 2: " + result);
        return result;
    }
    

    @PostMapping("/operation3")
    public int operation3(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 3");
        int result = (a + b) * 3 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 3: " + result);
        return result;
    }
    

    @PostMapping("/operation4")
    public int operation4(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 4");
        int result = (a + b) * 4 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 4: " + result);
        return result;
    }
    

    @PostMapping("/operation5")
    public int operation5(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 5");
        int result = (a + b) * 5 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 5: " + result);
        return result;
    }
    

    @PostMapping("/operation6")
    public int operation6(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 6");
        int result = (a + b) * 6 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 6: " + result);
        return result;
    }
    

    @PostMapping("/operation7")
    public int operation7(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 7");
        int result = (a + b) * 7 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 7: " + result);
        return result;
    }
    

    @PostMapping("/operation8")
    public int operation8(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 8");
        int result = (a + b) * 8 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 8: " + result);
        return result;
    }
    

    @PostMapping("/operation9")
    public int operation9(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 9");
        int result = (a + b) * 9 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 9: " + result);
        return result;
    }
    

    @PostMapping("/operation10")
    public int operation10(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 10");
        int result = (a + b) * 10 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 10: " + result);
        return result;
    }
    

    @PostMapping("/operation11")
    public int operation11(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 11");
        int result = (a + b) * 11 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 11: " + result);
        return result;
    }
    

    @PostMapping("/operation12")
    public int operation12(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 12");
        int result = (a + b) * 12 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 12: " + result);
        return result;
    }
    

    @PostMapping("/operation13")
    public int operation13(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 13");
        int result = (a + b) * 13 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 13: " + result);
        return result;
    }
    

    @PostMapping("/operation14")
    public int operation14(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 14");
        int result = (a + b) * 14 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 14: " + result);
        return result;
    }
    

    @PostMapping("/operation15")
    public int operation15(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 15");
        int result = (a + b) * 15 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 15: " + result);
        return result;
    }
    

    @PostMapping("/operation16")
    public int operation16(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 16");
        int result = (a + b) * 16 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 16: " + result);
        return result;
    }
    

    @PostMapping("/operation17")
    public int operation17(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 17");
        int result = (a + b) * 17 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 17: " + result);
        return result;
    }
    

    @PostMapping("/operation18")
    public int operation18(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 18");
        int result = (a + b) * 18 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 18: " + result);
        return result;
    }
    

    @PostMapping("/operation19")
    public int operation19(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 19");
        int result = (a + b) * 19 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 19: " + result);
        return result;
    }
    

    @PostMapping("/operation20")
    public int operation20(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 20");
        int result = (a + b) * 20 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 20: " + result);
        return result;
    }
    

    @PostMapping("/operation21")
    public int operation21(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 21");
        int result = (a + b) * 21 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 21: " + result);
        return result;
    }
    

    @PostMapping("/operation22")
    public int operation22(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 22");
        int result = (a + b) * 22 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 22: " + result);
        return result;
    }
    

    @PostMapping("/operation23")
    public int operation23(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 23");
        int result = (a + b) * 23 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 23: " + result);
        return result;
    }
    

    @PostMapping("/operation24")
    public int operation24(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 24");
        int result = (a + b) * 24 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 24: " + result);
        return result;
    }
    

    @PostMapping("/operation25")
    public int operation25(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 25");
        int result = (a + b) * 25 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 25: " + result);
        return result;
    }
    

    @PostMapping("/operation26")
    public int operation26(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 26");
        int result = (a + b) * 26 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 26: " + result);
        return result;
    }
    

    @PostMapping("/operation27")
    public int operation27(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 27");
        int result = (a + b) * 27 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 27: " + result);
        return result;
    }
    

    @PostMapping("/operation28")
    public int operation28(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 28");
        int result = (a + b) * 28 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 28: " + result);
        return result;
    }
    

    @PostMapping("/operation29")
    public int operation29(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 29");
        int result = (a + b) * 29 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 29: " + result);
        return result;
    }
    

    @PostMapping("/operation30")
    public int operation30(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 30");
        int result = (a + b) * 30 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 30: " + result);
        return result;
    }
    

    @PostMapping("/operation31")
    public int operation31(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 31");
        int result = (a + b) * 31 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 31: " + result);
        return result;
    }
    

    @PostMapping("/operation32")
    public int operation32(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 32");
        int result = (a + b) * 32 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 32: " + result);
        return result;
    }
    

    @PostMapping("/operation33")
    public int operation33(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 33");
        int result = (a + b) * 33 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 33: " + result);
        return result;
    }
    

    @PostMapping("/operation34")
    public int operation34(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 34");
        int result = (a + b) * 34 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 34: " + result);
        return result;
    }
    

    @PostMapping("/operation35")
    public int operation35(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 35");
        int result = (a + b) * 35 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 35: " + result);
        return result;
    }
    

    @PostMapping("/operation36")
    public int operation36(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 36");
        int result = (a + b) * 36 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 36: " + result);
        return result;
    }
    

    @PostMapping("/operation37")
    public int operation37(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 37");
        int result = (a + b) * 37 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 37: " + result);
        return result;
    }
    

    @PostMapping("/operation38")
    public int operation38(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 38");
        int result = (a + b) * 38 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 38: " + result);
        return result;
    }
    

    @PostMapping("/operation39")
    public int operation39(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 39");
        int result = (a + b) * 39 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 39: " + result);
        return result;
    }
    

    @PostMapping("/operation40")
    public int operation40(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 40");
        int result = (a + b) * 40 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 40: " + result);
        return result;
    }
    

    @PostMapping("/operation41")
    public int operation41(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 41");
        int result = (a + b) * 41 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 41: " + result);
        return result;
    }
    

    @PostMapping("/operation42")
    public int operation42(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 42");
        int result = (a + b) * 42 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 42: " + result);
        return result;
    }
    

    @PostMapping("/operation43")
    public int operation43(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 43");
        int result = (a + b) * 43 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 43: " + result);
        return result;
    }
    

    @PostMapping("/operation44")
    public int operation44(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 44");
        int result = (a + b) * 44 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 44: " + result);
        return result;
    }
    

    @PostMapping("/operation45")
    public int operation45(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 45");
        int result = (a + b) * 45 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 45: " + result);
        return result;
    }
    

    @PostMapping("/operation46")
    public int operation46(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 46");
        int result = (a + b) * 46 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 46: " + result);
        return result;
    }
    

    @PostMapping("/operation47")
    public int operation47(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 47");
        int result = (a + b) * 47 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 47: " + result);
        return result;
    }
    

    @PostMapping("/operation48")
    public int operation48(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 48");
        int result = (a + b) * 48 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 48: " + result);
        return result;
    }
    

    @PostMapping("/operation49")
    public int operation49(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 49");
        int result = (a + b) * 49 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 49: " + result);
        return result;
    }
    

    @PostMapping("/operation50")
    public int operation50(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 50");
        int result = (a + b) * 50 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 50: " + result);
        return result;
    }
    

    @PostMapping("/operation51")
    public int operation51(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 51");
        int result = (a + b) * 51 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 51: " + result);
        return result;
    }
    

    @PostMapping("/operation52")
    public int operation52(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 52");
        int result = (a + b) * 52 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 52: " + result);
        return result;
    }
    

    @PostMapping("/operation53")
    public int operation53(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 53");
        int result = (a + b) * 53 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 53: " + result);
        return result;
    }
    

    @PostMapping("/operation54")
    public int operation54(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 54");
        int result = (a + b) * 54 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 54: " + result);
        return result;
    }
    

    @PostMapping("/operation55")
    public int operation55(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 55");
        int result = (a + b) * 55 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 55: " + result);
        return result;
    }
    

    @PostMapping("/operation56")
    public int operation56(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 56");
        int result = (a + b) * 56 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 56: " + result);
        return result;
    }
    

    @PostMapping("/operation57")
    public int operation57(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 57");
        int result = (a + b) * 57 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 57: " + result);
        return result;
    }
    

    @PostMapping("/operation58")
    public int operation58(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 58");
        int result = (a + b) * 58 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 58: " + result);
        return result;
    }
    

    @PostMapping("/operation59")
    public int operation59(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 59");
        int result = (a + b) * 59 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 59: " + result);
        return result;
    }
    

    @PostMapping("/operation60")
    public int operation60(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 60");
        int result = (a + b) * 60 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 60: " + result);
        return result;
    }
    

    @PostMapping("/operation61")
    public int operation61(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 61");
        int result = (a + b) * 61 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 61: " + result);
        return result;
    }
    

    @PostMapping("/operation62")
    public int operation62(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 62");
        int result = (a + b) * 62 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 62: " + result);
        return result;
    }
    

    @PostMapping("/operation63")
    public int operation63(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 63");
        int result = (a + b) * 63 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 63: " + result);
        return result;
    }
    

    @PostMapping("/operation64")
    public int operation64(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 64");
        int result = (a + b) * 64 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 64: " + result);
        return result;
    }
    

    @PostMapping("/operation65")
    public int operation65(@RequestParam int a, @RequestParam int b) {
        System.out.println("Performing operation 65");
        int result = (a + b) * 65 / (b == 0 ? 1 : b);
        System.out.println("Result from operation 65: " + result);
        return result;
    }
    
}
