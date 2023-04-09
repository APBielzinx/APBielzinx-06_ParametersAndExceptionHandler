package br.com.erudio;

import br.com.erudio.exceptions.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private static final String template = "Hellow, %s!";
    private static final AtomicLong counter = new AtomicLong();


    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    //soma
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{

            if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
                throw new UnsuportedMathOperationException("Please set a numeric value");
            }
                   return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    //subtração
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }


    //divisão

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    private Double convertToDouble(String strnumber) {
    if(strnumber == null) return 0D;
        String number  = strnumber.replaceAll(",",".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }


    //media
    @RequestMapping(value = "/med/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    public Double med(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
       double media = convertToDouble(numberOne) + convertToDouble(numberTwo) ;
        return media/2;
    }

    //raiz quadrada

    @RequestMapping(value = "/rai/{numberOne}",
            method = RequestMethod.GET)

    public Double rai(
            @PathVariable(value = "numberOne") String numberOne

    ) throws Exception{

        if (!isNumeric(numberOne)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return Math.sqrt(convertToDouble(numberOne));
    }

    private boolean isNumeric(String strnumber){
        if(strnumber == null) return false;
        String number  = strnumber.replaceAll(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");


    }

}
