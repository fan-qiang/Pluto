package com.fanqiang.sophone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.mvel2.ParserContext;
import org.mvel2.ast.ASTNode;
import org.mvel2.integration.Interceptor;
import org.mvel2.integration.VariableResolverFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class MvelTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MvelTest.class);

    @Test
    public void mvelTest(){
       JSONObject json = JSON.parseObject("{\n" +
               "    \"NetGrossInd\": \"1\",\n" +
               "    \"SenderCompID\": \"BookedCSTPFXServiceDown\",\n" +
               "    \"NoFxOptions\": [\n" +
               "      {\n" +
               "        \"DerivativeExerciseStyle\": \"0\",\n" +
               "        \"PutOrCall\": \"0\",\n" +
               "        \"StrikePrice\": \"6.3200\",\n" +
               "        \"Volatility\": \"3.2656\",\n" +
               "        \"NoCurrencyAmt\": [\n" +
               "          {\n" +
               "            \"Currency\": \"CNY\",\n" +
               "            \"CurrencyAmtType\": \"1\",\n" +
               "            \"Principal\": \"63200000.00\"\n" +
               "          },\n" +
               "          {\n" +
               "            \"Currency\": \"USD\",\n" +
               "            \"CurrencyAmtType\": \"2\",\n" +
               "            \"Principal\": \"10000000.00\"\n" +
               "          }\n" +
               "        ],\n" +
               "        \"Symbol\": \"USD.CNY\",\n" +
               "        \"MaturityDate\": \"20180316\",\n" +
               "        \"OptPayoutType\": \"1\",\n" +
               "        \"ExpireTimeZone\": \"Beijing\",\n" +
               "        \"NoPremium\": [\n" +
               "          {\n" +
               "            \"DecimalPlaces\": \"2\",\n" +
               "            \"OptPremiumBasis\": \"1\",\n" +
               "            \"OptPremiumCurrency\": \"CNY\",\n" +
               "            \"SettlDate\": \"20180313\",\n" +
               "            \"OptPremiumAmt\": \"50000.00\",\n" +
               "            \"DeliveryDate\": \"20180313\",\n" +
               "            \"OptPremiumValue\": \"50.00\"\n" +
               "          }\n" +
               "        ],\n" +
               "        \"Side\": \"1\",\n" +
               "        \"SettlType\": \"1W\",\n" +
               "        \"RiskLastQty\": \"10000000.00\",\n" +
               "        \"ExpireTime\": \"20180316-15:00:00\"\n" +
               "      }\n" +
               "    ],\n" +
               "    \"msgType\": \"8\",\n" +
               "    \"ExecID\": \"6.2.0435942\",\n" +
               "    \"TargetCompID\": \"CALYPSO_CSTPFX_TEST\",\n" +
               "    \"INF_TYPE\": \"FXOPT\",\n" +
               "    \"LastSpotRate\": \"6.3347\",\n" +
               "    \"DateConfirmed\": \"20180309\",\n" +
               "    \"TradeInstrument\": \"Q\",\n" +
               "    \"OPTDataType\": \"1\",\n" +
               "    \"TradingMode\": \"1\",\n" +
               "    \"SendingTime\": \"20180309-08:02:00.114\",\n" +
               "    \"BookID\": \"GTJAFI_FXPP_OPT_00\",\n" +
               "    \"TradeDate\": \"20180309\",\n" +
               "    \"NoPartyIDs\": [\n" +
               "      {\n" +
               "        \"PartyRole\": \"114\",\n" +
               "        \"PartyID\": \"102010531000000205011\",\n" +
               "        \"NoPartySubIDs\": [\n" +
               "          {\n" +
               "            \"PartySubIDType\": \"101\",\n" +
               "            \"PartySubID\": \"syn.dealer@gtja\"\n" +
               "          },\n" +
               "          {\n" +
               "            \"PartySubIDType\": \"102\",\n" +
               "            \"PartySubID\": \"GTJA\"\n" +
               "          },\n" +
               "          {\n" +
               "            \"PartySubIDType\": \"5\",\n" +
               "            \"PartySubID\": \"guotai junan securities co.ltd\"\n" +
               "          },\n" +
               "          {\n" +
               "            \"PartySubIDType\": \"255\",\n" +
               "            \"PartySubID\": \"GTJA_0001\"\n" +
               "          }\n" +
               "        ]\n" +
               "      },\n" +
               "      {\n" +
               "        \"PartyRole\": \"113\",\n" +
               "        \"PartyID\": \"100000411000000101001\",\n" +
               "        \"NoPartySubIDs\": [\n" +
               "          {\n" +
               "            \"PartySubIDType\": \"101\",\n" +
               "            \"PartySubID\": \"chenxuejun.dealer@ccbh\"\n" +
               "          },\n" +
               "          {\n" +
               "            \"PartySubIDType\": \"102\",\n" +
               "            \"PartySubID\": \"CCBH\"\n" +
               "          },\n" +
               "          {\n" +
               "            \"PartySubIDType\": \"5\",\n" +
               "            \"PartySubID\": \"China Construction Bank Corporation\"\n" +
               "          },\n" +
               "          {\n" +
               "            \"PartySubIDType\": \"255\",\n" +
               "            \"PartySubID\": \"CCBH_0001\"\n" +
               "          }\n" +
               "        ]\n" +
               "      }\n" +
               "    ],\n" +
               "    \"ExecType\": \"F\",\n" +
               "    \"CFETSCnfmIndicator\": \"Y\",\n" +
               "    \"TradeTime\": \"16:04:15\",\n" +
               "    \"TradeMethod\": \"4\",\n" +
               "    \"INF_NAME\": \"FXCSTP\",\n" +
               "    \"TargetSubID\": \"cstp.settle@gtja\",\n" +
               "    \"MsgSeqNum\": \"50\",\n" +
               "    \"MarketIndicator\": \"19\",\n" +
               "    \"DealTransType\": \"0\",\n" +
               "    \"DerivativeExerciseStatus\": \"1\",\n" +
               "    \"NoOptionExercise\": [\n" +
               "      {\n" +
               "        \"DerivativeExerciseStyle\": \"0\",\n" +
               "        \"NoOptSettlAmt\": [\n" +
               "          {\n" +
               "            \"OptSettlAmtType\": \"1\",\n" +
               "            \"DeliveryDate\": \"20180320\"\n" +
               "          }\n" +
               "        ]\n" +
               "      }\n" +
               "    ],\n" +
               "    \"LastForwardPoints\": \"18.35\"\n" +
               "  }");


       Map<String,Object> objectMap = new HashMap<>();
       objectMap.put("messageContent",json);
       objectMap.put("messatType","122222");
       objectMap.put("type","10176");

       // String template = "Hello, my name is @{name.toUpperCase()}";
        Map vars = new HashMap();
//        vars.put("name", "Michael");

       // String output = (String) TemplateRuntime.eval(template, vars);

        Interceptor autowiredInterceptor =  new Interceptor(){
            @Override
            public int doBefore(ASTNode node, VariableResolverFactory factory) {
                LOGGER.info("before autowried ... ");
                return 0;
            }

            @Override
            public int doAfter(Object exitStackValue, ASTNode node, VariableResolverFactory factory) {
                exitStackValue = "123123123";
                LOGGER.info(exitStackValue.toString());
                return 0;
            }
        };

        ParserContext context = new ParserContext();


        Map<String, Interceptor> myInterceptors = new HashMap<>();

        myInterceptors.put("Autowired", autowiredInterceptor);

        context.setInterceptors(myInterceptors);


        //LOGGER.info(output);

//       LOGGER.info(MVEL.eval("import com.alibaba.fastjson.JSONPath; " +
//               "JSONPath.eval(messageContent,'$.NetGrossInd')",objectMap).toString());
//
//        LOGGER.info(MVEL.eval(" result = {'abc':'eee'} ; if(messatType == 'd' && type == '10176'){" +
//                " result['newkey'] = '12345'; " +
//                "}; return result" ,objectMap).toString());

        ///LOGGER.info(MVEL.eval(" 104.39484B *10 " ,objectMap).toString());

    }
}
