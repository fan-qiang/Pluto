package com.fanqiang.sophon;

import com.fanqiang.sophon.domain.*;
import com.fanqiang.sophon.jaxb.bond.SUMMIT;
import org.apache.camel.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Converter
public class TradeConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(TradeConverter.class);

    private static DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyyMMdd");


    public static LocalDate parseDate(String date){
        if(StringUtils.hasText(date)){
            return LocalDate.parse(date,dateTimeFormatter);
        }
        return null;
    }


    @Converter
    public static Bond convertToBond(SUMMIT summit){
       Bond bond = new Bond();
       Trade trade  = bond;

       SUMMIT.COMMON common =  summit.getCOMMON();
       trade.setAction(common.getAction());
       trade.setMsgId(common.getMsgId());
       trade.setExternalId(common.getExternalId());
       trade.setSourceSystem(common.getSourceSystem());
       trade.setTargetSystem(common.getTargetSystem());
       trade.setType(common.getType());

       trade.setTimestamp(common.getTimestamp());

        trade.setVersion(common.getVersion());

        SUMMIT.TRADEDETAIL tradeDetail  =  summit.getTRADEDETAIL();
        SUMMIT.TRADEDETAIL.TRADELIST tradelist =  tradeDetail.getTRADELIST();
        SUMMIT.TRADEDETAIL.TRADELIST.BONDTR bondtr = tradelist.getBONDTR();
        SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back back = bondtr.getBack();

        SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env env = bondtr.getEnv();
        trade.setTradeType(tradeDetail.getTRADELIST().getBONDTR().getTradeType());
        trade.setTradeDate(parseDate(env.getENV().getTradeDate()));
        trade.setTrader(env.getENV().getTrader());
        trade.setCompany(env.getENV().getCompany());
        trade.setCust(env.getENV().getCust());
        trade.setDesk(env.getENV().getDesk());
        trade.setBook(env.getENV().getBook());
        trade.setComment1(env.getENV().getComment1());
        trade.setComment2(env.getENV().getComment2());
        trade.setExtSystem(back.getBACK().getExtSystem());
        trade.setExtTradeId(back.getBACK().getExtTradeId());

        SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond.BOND bondDetail = bondtr.getBond().getBOND();
        bond.setNotional(bondDetail.getNotional());

        if(StringUtils.hasText(bondDetail.getAccrual())){
            bond.setAccrual(new BigDecimal(bondDetail.getAccrual()));
        }
        bond.setCcy(bondDetail.getCcy());
        bond.setPors(bondDetail.getPorS());
        bond.setPrice(bondDetail.getPrice());
        bond.setSec(bondDetail.getSec()+"");
        if(null != bondDetail.getSettleDate()){
                bond.setSettleDate(parseDate(bondDetail.getSettleDate()));
        }
        if(null != bondDetail.getValueDate()){
            bond.setValueDate(parseDate(bondDetail.getValueDate()));
        }

        bond.setSettlement(bondDetail.getSettlement());
        bond.setYield(bondDetail.getYield());
        return bond;
    }


    @Converter
    public static ForexFWD convertForexFwd(com.fanqiang.sophon.jaxb.forexFWD.SUMMIT summit){
        ForexFWD forexFWD = new ForexFWD();
        Trade trade  = forexFWD;

        com.fanqiang.sophon.jaxb.forexFWD.SUMMIT.COMMON common =  summit.getCOMMON();
        trade.setAction(common.getAction());
        trade.setMsgId(common.getMsgId());
        trade.setExternalId(common.getExternalId());
        trade.setSourceSystem(common.getSourceSystem());
        trade.setTargetSystem(common.getTargetSystem());
        trade.setType(common.getType());
        trade.setTimestamp(common.getTimestamp());
        trade.setVersion(common.getVersion());

        com.fanqiang.sophon.jaxb.forexFWD.SUMMIT.TRADEDETAIL tradeDetail  =  summit.getTRADEDETAIL();
        com.fanqiang.sophon.jaxb.forexFWD.SUMMIT.TRADEDETAIL.TRADELIST tradelist =  tradeDetail.getTRADELIST();
        com.fanqiang.sophon.jaxb.forexFWD.SUMMIT.TRADEDETAIL.TRADELIST.FXFWD fxfwd = tradelist.getFXFWD();
        com.fanqiang.sophon.jaxb.forexFWD.SUMMIT.TRADEDETAIL.TRADELIST.FXFWD.Back back = fxfwd.getBack();
        com.fanqiang.sophon.jaxb.forexFWD.SUMMIT.TRADEDETAIL.TRADELIST.FXFWD.Env env = fxfwd.getEnv();

        trade.setTradeType(tradeDetail.getTRADELIST().getFXFWD().getTradeType());
        trade.setTradeDate(parseDate(env.getENV().getTradeDate()));
        trade.setTrader(env.getENV().getTrader());
        trade.setCompany(env.getENV().getCompany());
        trade.setCust(env.getENV().getCust());
        trade.setDesk(env.getENV().getDesk());
        trade.setBook(env.getENV().getBook());
        trade.setComment1(env.getENV().getComment1());
        trade.setComment2(env.getENV().getComment2());
        trade.setExtSystem(back.getBACK().getExtSystem());
        trade.setExtTradeId(back.getBACK().getExtTradeId());

        forexFWD.setPors(fxfwd.getForex().getFOREX().getPorS());
        forexFWD.setSpotDate(parseDate(fxfwd.getForex().getFOREX().getSpotDate()));
        forexFWD.setBoughtCcy(fxfwd.getForex().getFOREX().getBoughtCcy());
        forexFWD.setSoldCcy(fxfwd.getForex().getFOREX().getSoldCcy());
        forexFWD.setSoldAmt(fxfwd.getForex().getFOREX().getSoldAmt());
        forexFWD.setSpotRate(fxfwd.getForex().getFOREX().getSoldAmt());
        forexFWD.setXRate(fxfwd.getForex().getFOREX().getXRate());
        forexFWD.setSplitSpotOrSwap(fxfwd.getForex().getFOREX().getSplitSpotOrSwap());
        forexFWD.setCTimeOptStartDate(parseDate(fxfwd.getForex().getFOREX().getCTimeOptStartDate()));
        forexFWD.setCTimeOptEndDate(parseDate(fxfwd.getForex().getFOREX().getCTimeOptEndDate()));

        com.fanqiang.sophon.jaxb.forexFWD.SUMMIT.TRADEDETAIL.TRADELIST.FXFWD.Forex.FOREX.BookData bookData = fxfwd.getForex().getFOREX().getBookData();
        if(!CollectionUtils.isEmpty(bookData.getFXBKDATA())){
            forexFWD.setBookList(
                    bookData.getFXBKDATA().stream().map(
                            book->{
                                ForexFWD.ForeFWDBook fwdBook  = new ForexFWD.ForeFWDBook();
                                fwdBook.setBook(book.getBook());
                                fwdBook.setDesk(book.getDesk());
                                fwdBook.setCcy1(book.getCcy1());
                                fwdBook.setCcy2(book.getCcy2());
                                if(null != book.getRate()){
                                    fwdBook.setRate(book.getRate().getValue());
                                }
                                if(null != book.getNearRate()){
                                    fwdBook.setNearRate(book.getNearRate().getValue());
                                }
                                if(null != book.getTrueSpotRate()){
                                    fwdBook.setTrueSpotRate(book.getTrueSpotRate().getValue());
                                }
                                if(null != book.getFarRate()){
                                    fwdBook.setFarRate(book.getFarRate().getValue());
                                }
                                fwdBook.setSplitRateFormat(book.getSplitRateFormat());
                                fwdBook.setBookType(book.getBookType());
                                fwdBook.setForexFWD(forexFWD);
                                return fwdBook;
                            }
                    ).collect(Collectors.toList())
            );
        }

        return  forexFWD;
    }

    @Converter
    public static FxOpt convertFxopt(com.fanqiang.sophon.jaxb.fxOpt.SUMMIT summit){
        FxOpt fxOpt = new FxOpt();

        Trade trade  = fxOpt;

        com.fanqiang.sophon.jaxb.fxOpt.SUMMIT.COMMON common =  summit.getCOMMON();
        trade.setAction(common.getAction());
        trade.setMsgId(common.getMsgId());
        trade.setExternalId(common.getExternalId());
        trade.setSourceSystem(common.getSourceSystem());
        trade.setTargetSystem(common.getTargetSystem());
        trade.setType(common.getType());
        trade.setTimestamp(common.getTimestamp());
        trade.setVersion(common.getVersion());

        com.fanqiang.sophon.jaxb.fxOpt.SUMMIT.TRADEDETAIL tradeDetail  =  summit.getTRADEDETAIL();
        com.fanqiang.sophon.jaxb.fxOpt.SUMMIT.TRADEDETAIL.TRADELIST tradelist =  tradeDetail.getTRADELIST();
        com.fanqiang.sophon.jaxb.fxOpt.SUMMIT.TRADEDETAIL.TRADELIST.FXOPTTR fxopttr = tradelist.getFXOPTTR();
        com.fanqiang.sophon.jaxb.fxOpt.SUMMIT.TRADEDETAIL.TRADELIST.FXOPTTR.Back back = fxopttr.getBack();

        com.fanqiang.sophon.jaxb.fxOpt.SUMMIT.TRADEDETAIL.TRADELIST.FXOPTTR.Env env = fxopttr.getEnv();

        trade.setTradeType(tradeDetail.getTRADELIST().getFXOPTTR().getTradeType());
        trade.setTradeDate(parseDate(env.getENV().getTradeDate()));
        trade.setTrader(env.getENV().getTrader());
        trade.setCompany(env.getENV().getCompany());
        trade.setCust(env.getENV().getCust());
        trade.setDesk(env.getENV().getDesk());
        trade.setBook(env.getENV().getBook());
        trade.setCompany(env.getENV().getCompany());
        trade.setComment1(env.getENV().getComment1());
        trade.setComment2(env.getENV().getComment2());
        trade.setExtSystem(back.getBACK().getExtSystem());
        trade.setExtTradeId(back.getBACK().getExtTradeId());


        // TODO: 2019-02-22 FxOpt
        com.fanqiang.sophon.jaxb.fxOpt.SUMMIT.TRADEDETAIL.TRADELIST.FXOPTTR.Option option = fxopttr.getOption();
        fxOpt.setPors(option.getOPTION().getPorS());
        fxOpt.setPorc(option.getOPTION().getPorC());
        fxOpt.setStyle(option.getOPTION().getStyle());
        fxOpt.setStrike(option.getOPTION().getStrike());
        fxOpt.setExpDate(parseDate(option.getOPTION().getExpDate()));
        fxOpt.setSettleDataStlDate(parseDate(option.getOPTION().getSETTLEDATAStlDate()));
        fxOpt.setSettledataStlmode(option.getOPTION().getSETTLEDATAStlMode());
        fxOpt.setPremdataCcy(option.getOPTION().getPREMDATACcy());
        fxOpt.setPremdataMode(option.getOPTION().getPREMDATAMode());
        fxOpt.setPremdataDate(parseDate(option.getOPTION().getPREMDATADate()));
        fxOpt.setPremdataPremium(option.getOPTION().getPREMDATAPremium());

        List<com.fanqiang.sophon.jaxb.fxOpt.SUMMIT.TRADEDETAIL.TRADELIST.FXOPTTR.FxOptList.FXOPTION> fxoptions = fxopttr.getFxOptList().getFXOPTION();
        if(!CollectionUtils.isEmpty(fxoptions)){
            fxOpt.setOptionList(
                    fxoptions.stream().map(
                            xmlOption -> {
                                FxOpt.FxoptOption fxoptOption = new FxOpt.FxoptOption();
                                fxoptOption.setSource(xmlOption.getSource());
                                fxoptOption.setValDate(parseDate(xmlOption.getValDate()));
                                fxoptOption.setMainCcy(xmlOption.getMainCcy());
                                if(null != xmlOption.getMainAmount()){
                                    fxoptOption.setMainAmount(xmlOption.getMainAmount().getValue());
                                }
                                fxoptOption.setMoneyCcy(xmlOption.getMoneyCcy());
                                if(null != xmlOption.getMoneyAmount()){
                                    fxoptOption.setMoneyAmount(xmlOption.getMoneyAmount().getValue());
                                }
                                fxoptOption.setFxOpt(fxOpt);
                                return fxoptOption;
                            }
                    ).collect(Collectors.toList())
            );
        }

        return  fxOpt;
    }

    @Converter
    public static FxSPOT convertFxspot(com.fanqiang.sophon.jaxb.fxSpot.SUMMIT summit){
        FxSPOT fxspot = new FxSPOT();

        Trade trade  = fxspot;

        com.fanqiang.sophon.jaxb.fxSpot.SUMMIT.COMMON common =  summit.getCOMMON();
        trade.setAction(common.getAction());
        trade.setMsgId(common.getMsgId());
        trade.setExternalId(common.getExternalId());
        trade.setSourceSystem(common.getSourceSystem());
        trade.setTargetSystem(common.getTargetSystem());
        trade.setType(common.getType());
        trade.setTimestamp(common.getTimestamp());
        trade.setVersion(common.getVersion());

        com.fanqiang.sophon.jaxb.fxSpot.SUMMIT.TRADEDETAIL tradeDetail  =  summit.getTRADEDETAIL();
        com.fanqiang.sophon.jaxb.fxSpot.SUMMIT.TRADEDETAIL.TRADELIST tradelist =  tradeDetail.getTRADELIST();
        com.fanqiang.sophon.jaxb.fxSpot.SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT fxfwd = tradelist.getFXSPOT();
        com.fanqiang.sophon.jaxb.fxSpot.SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back back = fxfwd.getBack();
        com.fanqiang.sophon.jaxb.fxSpot.SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env env = fxfwd.getEnv();

        trade.setTradeType(tradeDetail.getTRADELIST().getFXSPOT().getTradeType());
        trade.setTradeDate(parseDate(env.getENV().getTradeDate()));
        trade.setTrader(env.getENV().getTrader());
        trade.setCompany(env.getENV().getCompany());
        trade.setCust(env.getENV().getCust());
        trade.setDesk(env.getENV().getDesk());
        trade.setBook(env.getENV().getBook());
        trade.setComment1(env.getENV().getComment1());
        trade.setComment2(env.getENV().getComment2());
        trade.setExtSystem(back.getBACK().getExtSystem());
        trade.setExtTradeId(back.getBACK().getExtTradeId());

        fxspot.setPors(fxfwd.getForex().getFOREX().getPorS());
        fxspot.setValDate(parseDate(fxfwd.getForex().getFOREX().getValdate()));
        fxspot.setSpotDate(parseDate(fxfwd.getForex().getFOREX().getSpotDate()));
        fxspot.setBoughtCcy(fxfwd.getForex().getFOREX().getBoughtCcy());
        fxspot.setBoughtAmt(fxfwd.getForex().getFOREX().getBoughtAmt());
        fxspot.setSoldCcy(fxfwd.getForex().getFOREX().getSoldCcy());
        fxspot.setSoldAmt(fxfwd.getForex().getFOREX().getSoldAmt());
        fxspot.setSplitCcy(fxfwd.getForex().getFOREX().getSplitCcy());
        fxspot.setSplitSpotOrSwap(fxfwd.getForex().getFOREX().getSplitSpotOrSwap());

        com.fanqiang.sophon.jaxb.fxSpot.SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData bookData = fxfwd.getForex().getFOREX().getBookData();
        if(!CollectionUtils.isEmpty(bookData.getFXBKDATA())){
            fxspot.setBookList(
                    bookData.getFXBKDATA().stream().map(
                            book->{
                                FxSPOT.FxSpotBook fwdBook  = new FxSPOT.FxSpotBook();
                                fwdBook.setBook(book.getBook());
                                fwdBook.setDesk(book.getDesk());
                                fwdBook.setCcy1(book.getCcy1());
                                fwdBook.setCcy2(book.getCcy2());
                                if(null != book.getRate()){
                                    fwdBook.setRate(book.getRate().getValue());
                                }
                                if(null != book.getNearRate()){
                                    fwdBook.setNearRate(book.getNearRate().getValue());
                                }
                                if(null != book.getTrueSpotRate()){
                                    fwdBook.setTrueSpotRate(book.getTrueSpotRate().getValue());
                                }
                                if(null != book.getFarRate()){
                                    fwdBook.setFarRate(book.getFarRate().getValue());
                                }
                                fwdBook.setSplitRateFormat(book.getSplitRateFormat());
                                fwdBook.setBookType(book.getBookType());
                                fwdBook.setFxspot(fxspot);
                                return fwdBook;
                            }
                    ).collect(Collectors.toList())
            );
        }




        return  fxspot;
    }

    @Converter
    public static FxSwap convertFxSwap(com.fanqiang.sophon.jaxb.fxSwap.SUMMIT summit){
        FxSwap fxSwap = new FxSwap();

        Trade trade  = fxSwap;

        com.fanqiang.sophon.jaxb.fxSwap.SUMMIT.COMMON common =  summit.getCOMMON();
        trade.setAction(common.getAction());
        trade.setMsgId(common.getMsgId());
        trade.setExternalId(common.getExternalId());
        trade.setSourceSystem(common.getSourceSystem());
        trade.setTargetSystem(common.getTargetSystem());
        trade.setType(common.getType());
        trade.setTimestamp(common.getTimestamp());
        trade.setVersion(common.getVersion());

        com.fanqiang.sophon.jaxb.fxSwap.SUMMIT.TRADEDETAIL tradeDetail  =  summit.getTRADEDETAIL();
        com.fanqiang.sophon.jaxb.fxSwap.SUMMIT.TRADEDETAIL.TRADELIST tradelist =  tradeDetail.getTRADELIST();
        com.fanqiang.sophon.jaxb.fxSwap.SUMMIT.TRADEDETAIL.TRADELIST.FXSWAP fxfwd = tradelist.getFXSWAP();
        com.fanqiang.sophon.jaxb.fxSwap.SUMMIT.TRADEDETAIL.TRADELIST.FXSWAP.Back back = fxfwd.getBack();
        com.fanqiang.sophon.jaxb.fxSwap.SUMMIT.TRADEDETAIL.TRADELIST.FXSWAP.Env env = fxfwd.getEnv();

        trade.setTradeType(tradeDetail.getTRADELIST().getFXSWAP().getTradeType());
        trade.setTradeDate(parseDate(env.getENV().getTradeDate()));
        trade.setTrader(env.getENV().getTrader());
        trade.setCompany(env.getENV().getCompany());
        trade.setCust(env.getENV().getCust());
        trade.setDesk(env.getENV().getDesk());
        trade.setBook(env.getENV().getBook());
        trade.setComment1(env.getENV().getComment1());
        trade.setComment2(env.getENV().getComment2());
        trade.setExtSystem(back.getBACK().getExtSystem());
        trade.setExtTradeId(back.getBACK().getExtTradeId());

        // TODO: 2019-02-22 fxSwap

        fxSwap.setPors(fxfwd.getForex().getFOREX().getPorS());
        fxSwap.setValdate(parseDate(fxfwd.getForex().getFOREX().getValdate()));
        fxSwap.setSpotDate(parseDate(fxfwd.getForex().getFOREX().getSpotDate()));
        fxSwap.setShortXRate(fxfwd.getForex().getFOREX().getShortXRate());
        fxSwap.setSpotRate(fxfwd.getForex().getFOREX().getSpotRate());
        fxSwap.setShortValDate(parseDate(fxfwd.getForex().getFOREX().getShortValDate()));
        fxSwap.setXRate(fxfwd.getForex().getFOREX().getXRate());
        fxSwap.setBoughtCcy(fxfwd.getForex().getFOREX().getBoughtCcy());
        fxSwap.setSoldCcy(fxfwd.getForex().getFOREX().getSoldCcy());
        fxSwap.setSoldAmt(fxfwd.getForex().getFOREX().getSoldAmt());
        fxSwap.setFwdBoughtAmt(fxfwd.getForex().getFOREX().getFwdBoughtAmt());
        fxSwap.setFwdSoldAmt(fxfwd.getForex().getFOREX().getFwdSoldAmt());
        fxSwap.setSplitCcy(fxfwd.getForex().getFOREX().getSplitCcy());
        fxSwap.setSplitSpotOrSwap(fxfwd.getForex().getFOREX().getSplitSpotOrSwap());
        fxSwap.setCTimeOptStartDate(parseDate(fxfwd.getForex().getFOREX().getCTimeOptStartDate()));
        fxSwap.setCTimeOptEndDate(parseDate(fxfwd.getForex().getFOREX().getCTimeOptEndDate()));

        com.fanqiang.sophon.jaxb.fxSwap.SUMMIT.TRADEDETAIL.TRADELIST.FXSWAP.Forex.FOREX.BookData bookData = fxfwd.getForex().getFOREX().getBookData();
        if(!CollectionUtils.isEmpty(bookData.getFXBKDATA())){
            fxSwap.setBookList(
                    bookData.getFXBKDATA().stream().map(
                            book->{
                                FxSwap.FxSwapBook fwdBook  = new FxSwap.FxSwapBook();
                                fwdBook.setBook(book.getBook());
                                fwdBook.setDesk(book.getDesk());
                                fwdBook.setCcy1(book.getCcy1());
                                fwdBook.setCcy2(book.getCcy2());
                                if(null != book.getRate()){
                                    fwdBook.setRate(book.getRate().getValue());
                                }
                                if(null != book.getNearRate()){
                                    fwdBook.setNearRate(book.getNearRate().getValue());
                                }
                                if(null != book.getTrueSpotRate()){
                                    fwdBook.setTrueSpotRate(book.getTrueSpotRate().getValue());
                                }
                                if(null != book.getFarRate()){
                                    fwdBook.setFarRate(book.getFarRate().getValue());
                                }
                                fwdBook.setSplitRateFormat(book.getSplitRateFormat());
                                fwdBook.setBookType(book.getBookType());
                                fwdBook.setFxSwap(fxSwap);
                                return fwdBook;
                            }
                    ).collect(Collectors.toList())
            );
        }


        return  fxSwap;
    }


    @Converter
    public static MM convertMM(com.fanqiang.sophon.jaxb.mm.SUMMIT summit){
        MM mm = new MM();

        Trade trade  = mm;

        com.fanqiang.sophon.jaxb.mm.SUMMIT.COMMON common =  summit.getCOMMON();
        trade.setAction(common.getAction());
        trade.setMsgId(common.getMsgId());
        trade.setExternalId(common.getExternalId());
        trade.setSourceSystem(common.getSourceSystem());
        trade.setTargetSystem(common.getTargetSystem());
        trade.setType(common.getType());
        trade.setTimestamp(common.getTimestamp());
        trade.setVersion(common.getVersion());

        com.fanqiang.sophon.jaxb.mm.SUMMIT.TRADEDETAIL tradeDetail  =  summit.getTRADEDETAIL();
        com.fanqiang.sophon.jaxb.mm.SUMMIT.TRADEDETAIL.TRADELIST tradelist =  tradeDetail.getTRADELIST();
        com.fanqiang.sophon.jaxb.mm.SUMMIT.TRADEDETAIL.TRADELIST.MM fxfwd = tradelist.getMM();
        com.fanqiang.sophon.jaxb.mm.SUMMIT.TRADEDETAIL.TRADELIST.MM.Back back = fxfwd.getBack();
        com.fanqiang.sophon.jaxb.mm.SUMMIT.TRADEDETAIL.TRADELIST.MM.Env env = fxfwd.getEnv();

        trade.setTradeType(tradeDetail.getTRADELIST().getMM().getTradeType());
        trade.setTradeDate(parseDate(env.getENV().getTradeDate()));
        trade.setTrader(env.getENV().getTrader());
        trade.setCompany(env.getENV().getCompany());
        trade.setCust(env.getENV().getCust());
        trade.setDesk(env.getENV().getDesk());
        trade.setBook(env.getENV().getBook());
        trade.setComment1(env.getENV().getComment1());
        trade.setComment2(env.getENV().getComment2());
        trade.setExtSystem(back.getBACK().getExtSystem());
        trade.setExtTradeId(back.getBACK().getExtTradeId());
        List<com.fanqiang.sophon.jaxb.mm.SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets.ASSET> assetList = fxfwd.getAssets().getASSET();

        if(!CollectionUtils.isEmpty(assetList)) {
            mm.setAssets(
                    assetList.stream().map(
                            asset -> {
                                MM.MMAsset mmAsset = new MM.MMAsset();
                                mmAsset.setPors(asset.getPorS());
                                mmAsset.setCcy(asset.getCcy());
                                mmAsset.setNotional(asset.getNotional());
                                mmAsset.setInterestRate(asset.getINTERESTRate());
                                mmAsset.setInterestDmindex(asset.getINTERESTDmIndex());
                                mmAsset.setInterestTerm(asset.getINTERESTTerm());
                                mmAsset.setInterestBasis(asset.getINTERESTBasis());
                                mmAsset.setInterestCcy(asset.getINTERESTCcy());
                                mmAsset.setSchedPayIntRule(asset.getSCHEDPayIntRule());
                                mmAsset.setDeliverable(asset.getDeliverable());
                                mmAsset.setInterestIntrateType(asset.getINTERESTIntRateType());
                                mmAsset.setEffDate(parseDate(asset.getEffDate()));
                                mmAsset.setMatDate(parseDate(asset.getMatDate()));
                                mmAsset.setMm(mm);
                                return mmAsset;
                            }
                    ).collect(Collectors.toList())
            );
        }
        return mm;
    }


    @Converter
    public static Repo convertRepo(com.fanqiang.sophon.jaxb.repo.SUMMIT summit){
        Repo repo = new Repo();

        Trade trade  = repo;
        com.fanqiang.sophon.jaxb.repo.SUMMIT.COMMON common =  summit.getCOMMON();
        trade.setAction(common.getAction());
        trade.setMsgId(common.getMsgId());
        trade.setExternalId(common.getExternalId());
        trade.setSourceSystem(common.getSourceSystem());
        trade.setTargetSystem(common.getTargetSystem());
        trade.setType(common.getType());
        trade.setTimestamp(common.getTimestamp());
        trade.setVersion(common.getVersion());

        com.fanqiang.sophon.jaxb.repo.SUMMIT.TRADEDETAIL tradeDetail  =  summit.getTRADEDETAIL();
        com.fanqiang.sophon.jaxb.repo.SUMMIT.TRADEDETAIL.TRADELIST tradelist =  tradeDetail.getTRADELIST();
        com.fanqiang.sophon.jaxb.repo.SUMMIT.TRADEDETAIL.TRADELIST.REPOTR fxfwd = tradelist.getREPOTR();
        com.fanqiang.sophon.jaxb.repo.SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back back = fxfwd.getBack();
        com.fanqiang.sophon.jaxb.repo.SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env env = fxfwd.getEnv();

        trade.setTradeType(tradeDetail.getTRADELIST().getREPOTR().getTradeType());
        trade.setTradeDate(parseDate(env.getENV().getTradeDate()));
        trade.setTrader(env.getENV().getTrader());
        trade.setCompany(env.getENV().getCompany());
        trade.setCust(env.getENV().getCust());
        trade.setDesk(env.getENV().getDesk());
        trade.setBook(env.getENV().getBook());

        trade.setComment1(env.getENV().getComment1());
        trade.setComment2(env.getENV().getComment2());
        trade.setExtSystem(back.getBACK().getExtSystem());
        trade.setExtTradeId(back.getBACK().getExtTradeId());

        com.fanqiang.sophon.jaxb.repo.SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO xmlRepo = fxfwd.getRepo().getREPO();

        repo.setRepType(xmlRepo.getRepType());
        repo.setRepoMktType(xmlRepo.getRepoMktType());
        repo.setPassThru(xmlRepo.getPassThru());
        repo.setMatPassThru(xmlRepo.getMatPassThru());
        repo.setNumCollateral(xmlRepo.getNumCollateral());

        if(xmlRepo.getNumCollateral()>0){
            List<com.fanqiang.sophon.jaxb.repo.SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList.COLLTRL> colltrls = fxfwd.getRepo().getREPO().getCollList().getCOLLTRL();

            if(!CollectionUtils.isEmpty(colltrls)){
                repo.setCollList(
                        colltrls.stream().map(xmlCollCtrl -> {
                            Repo.RepoColl repoColl = new Repo.RepoColl();
                            repoColl.setSec(xmlCollCtrl.getSec());
                            repoColl.setQuantity(xmlCollCtrl.getQuantity());
                            repoColl.setMarginExp(xmlCollCtrl.getMarginExp());
                            repoColl.setMargin(xmlCollCtrl.getMargin());
                            repoColl.setStartDirtyPrice(xmlCollCtrl.getStartDirtyPrice());
                            repoColl.setEndDirtyPrice(xmlCollCtrl.getEndDirtyPrice());
                            repoColl.setType(xmlCollCtrl.getType());
                            repoColl.setCcy(xmlCollCtrl.getCcy());
                            repoColl.setCollType(xmlCollCtrl.getCollType());
                            repoColl.setRepo(repo);
                            return repoColl;
                        }).collect(Collectors.toList())
                );
            }
        }
        return  repo;
    }

    @Converter
    public static Swap convertSwap(com.fanqiang.sophon.jaxb.swap.SUMMIT summit){
        Swap swap = new Swap();

        Trade trade  = swap;
        com.fanqiang.sophon.jaxb.swap.SUMMIT.COMMON common =  summit.getCOMMON();
        trade.setAction(common.getAction());
        trade.setMsgId(common.getMsgId());
        trade.setExternalId(common.getExternalId());
        trade.setSourceSystem(common.getSourceSystem());
        trade.setTargetSystem(common.getTargetSystem());
        trade.setType(common.getType());
        trade.setTimestamp(common.getTimestamp());
        trade.setVersion(common.getVersion());

        com.fanqiang.sophon.jaxb.swap.SUMMIT.TRADEDETAIL tradeDetail  =  summit.getTRADEDETAIL();
        com.fanqiang.sophon.jaxb.swap.SUMMIT.TRADEDETAIL.TRADELIST tradelist =  tradeDetail.getTRADELIST();
        com.fanqiang.sophon.jaxb.swap.SUMMIT.TRADEDETAIL.TRADELIST.SWAP fxfwd = tradelist.getSWAP();
        com.fanqiang.sophon.jaxb.swap.SUMMIT.TRADEDETAIL.TRADELIST.SWAP.Back back = fxfwd.getBack();
        com.fanqiang.sophon.jaxb.swap.SUMMIT.TRADEDETAIL.TRADELIST.SWAP.Env env = fxfwd.getEnv();

        trade.setTradeType(tradeDetail.getTRADELIST().getSWAP().getTradeType());
        trade.setTradeDate(parseDate(env.getENV().getTradeDate()));
        trade.setTrader(env.getENV().getTrader());
        trade.setCompany(env.getENV().getCompany());
        trade.setCust(env.getENV().getCust());
        trade.setDesk(env.getENV().getDesk());
        trade.setBook(env.getENV().getBook());
        trade.setComment1(env.getENV().getComment1());
        trade.setComment2(env.getENV().getComment2());
        trade.setExtSystem(back.getBACK().getExtSystem());
        trade.setExtTradeId(back.getBACK().getExtTradeId());
        List<com.fanqiang.sophon.jaxb.swap.SUMMIT.TRADEDETAIL.TRADELIST.SWAP.Assets.ASSET> assets = fxfwd.getAssets().getASSET();

        if(!CollectionUtils.isEmpty(assets)){
            swap.setAssets(
                assets.stream().map(xmlAsset->{
                    Swap.SwapAsset swapAsset = new Swap.SwapAsset();
                    swapAsset.setPors(xmlAsset.getPorS());
                    swapAsset.setCcy(xmlAsset.getCcy());
                    swapAsset.setNotional(xmlAsset.getNotional());
                    swapAsset.setEffDate(parseDate(xmlAsset.getEffDate()));
                    swapAsset.setMatDate(parseDate(xmlAsset.getMatDate()));
                    swapAsset.setInterestRate(xmlAsset.getINTERESTRate());
                    swapAsset.setInterestBasis(xmlAsset.getINTERESTBasis());
                    swapAsset.setInterestDmindex(xmlAsset.getINTERESTDmIndex());
                    swapAsset.setInterestTerm(xmlAsset.getINTERESTTerm());
                    swapAsset.setInterestSpread(xmlAsset.getINTERESTSpread());
                    swapAsset.setSchedPayIntRule(xmlAsset.getSCHEDPayIntRule());
                    swapAsset.setSchedPayFreq(xmlAsset.getSCHEDPayFreq());
                    swapAsset.setSchedPayAnnday(xmlAsset.getSCHEDPayAnnDay());
                    swapAsset.setSwap(swap);
                    return swapAsset;
                }).collect(Collectors.toList())
            );
        }

        return  swap;
    }

}