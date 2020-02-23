/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api-testnet.bybit.com]  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("APIKeyBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<APIKeyBase>>(){}.getType();
    }
    
    if ("APIKeyInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<APIKeyInfo>>(){}.getType();
    }
    
    if ("ConditionalBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConditionalBase>>(){}.getType();
    }
    
    if ("ConditionalCancelAllBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConditionalCancelAllBase>>(){}.getType();
    }
    
    if ("ConditionalCancelAllRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConditionalCancelAllRes>>(){}.getType();
    }
    
    if ("ConditionalOrdersRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConditionalOrdersRes>>(){}.getType();
    }
    
    if ("ConditionalOrdersResBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConditionalOrdersResBase>>(){}.getType();
    }
    
    if ("ConditionalRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConditionalRes>>(){}.getType();
    }
    
    if ("ExtFields".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtFields>>(){}.getType();
    }
    
    if ("FundRecordBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<FundRecordBase>>(){}.getType();
    }
    
    if ("FundingFeeBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<FundingFeeBase>>(){}.getType();
    }
    
    if ("FundingFeeRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<FundingFeeRes>>(){}.getType();
    }
    
    if ("FundingPredicted".equalsIgnoreCase(className)) {
      return new TypeToken<List<FundingPredicted>>(){}.getType();
    }
    
    if ("FundingPredictedBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<FundingPredictedBase>>(){}.getType();
    }
    
    if ("FundingRate".equalsIgnoreCase(className)) {
      return new TypeToken<List<FundingRate>>(){}.getType();
    }
    
    if ("FundingRateBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<FundingRateBase>>(){}.getType();
    }
    
    if ("FundingRecords".equalsIgnoreCase(className)) {
      return new TypeToken<List<FundingRecords>>(){}.getType();
    }
    
    if ("GetRiskLimitRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetRiskLimitRes>>(){}.getType();
    }
    
    if ("KlineBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<KlineBase>>(){}.getType();
    }
    
    if ("KlineRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<KlineRes>>(){}.getType();
    }
    
    if ("Leverage".equalsIgnoreCase(className)) {
      return new TypeToken<List<Leverage>>(){}.getType();
    }
    
    if ("LeverageInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<LeverageInfo>>(){}.getType();
    }
    
    if ("LeverageResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<LeverageResult>>(){}.getType();
    }
    
    if ("LotSizeFilter".equalsIgnoreCase(className)) {
      return new TypeToken<List<LotSizeFilter>>(){}.getType();
    }
    
    if ("OderBookRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<OderBookRes>>(){}.getType();
    }
    
    if ("OrderBookBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderBookBase>>(){}.getType();
    }
    
    if ("OrderCancelAllBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCancelAllBase>>(){}.getType();
    }
    
    if ("OrderCancelAllRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCancelAllRes>>(){}.getType();
    }
    
    if ("OrderCancelBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCancelBase>>(){}.getType();
    }
    
    if ("OrderListBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderListBase>>(){}.getType();
    }
    
    if ("OrderListData".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderListData>>(){}.getType();
    }
    
    if ("OrderRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderRes>>(){}.getType();
    }
    
    if ("OrderResBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResBase>>(){}.getType();
    }
    
    if ("Position".equalsIgnoreCase(className)) {
      return new TypeToken<List<Position>>(){}.getType();
    }
    
    if ("PositionInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<PositionInfo>>(){}.getType();
    }
    
    if ("PriceFilter".equalsIgnoreCase(className)) {
      return new TypeToken<List<PriceFilter>>(){}.getType();
    }
    
    if ("QueryOrderBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<QueryOrderBase>>(){}.getType();
    }
    
    if ("QueryOrderRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<QueryOrderRes>>(){}.getType();
    }
    
    if ("ReplaceConditionalBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReplaceConditionalBase>>(){}.getType();
    }
    
    if ("ReplaceOrderBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReplaceOrderBase>>(){}.getType();
    }
    
    if ("RiskIDRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiskIDRes>>(){}.getType();
    }
    
    if ("RiskLimitBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiskLimitBase>>(){}.getType();
    }
    
    if ("RiskLimitRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiskLimitRes>>(){}.getType();
    }
    
    if ("ServerTime".equalsIgnoreCase(className)) {
      return new TypeToken<List<ServerTime>>(){}.getType();
    }
    
    if ("SetRiskLimitBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<SetRiskLimitBase>>(){}.getType();
    }
    
    if ("SymbolInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<SymbolInfo>>(){}.getType();
    }
    
    if ("SymbolInfoBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<SymbolInfoBase>>(){}.getType();
    }
    
    if ("SymbolTickInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<SymbolTickInfo>>(){}.getType();
    }
    
    if ("Symbols".equalsIgnoreCase(className)) {
      return new TypeToken<List<Symbols>>(){}.getType();
    }
    
    if ("TradeRecords".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeRecords>>(){}.getType();
    }
    
    if ("TradeRecordsBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeRecordsBase>>(){}.getType();
    }
    
    if ("TradeRecordsInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeRecordsInfo>>(){}.getType();
    }
    
    if ("TradingStopBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradingStopBase>>(){}.getType();
    }
    
    if ("TradingStopRes".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradingStopRes>>(){}.getType();
    }
    
    if ("WithdrawBalance".equalsIgnoreCase(className)) {
      return new TypeToken<List<WithdrawBalance>>(){}.getType();
    }
    
    if ("WithdrawBalanceBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<WithdrawBalanceBase>>(){}.getType();
    }
    
    if ("WithdrawRecords".equalsIgnoreCase(className)) {
      return new TypeToken<List<WithdrawRecords>>(){}.getType();
    }
    
    if ("WithdrawResBase".equalsIgnoreCase(className)) {
      return new TypeToken<List<WithdrawResBase>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("APIKeyBase".equalsIgnoreCase(className)) {
      return new TypeToken<APIKeyBase>(){}.getType();
    }
    
    if ("APIKeyInfo".equalsIgnoreCase(className)) {
      return new TypeToken<APIKeyInfo>(){}.getType();
    }
    
    if ("ConditionalBase".equalsIgnoreCase(className)) {
      return new TypeToken<ConditionalBase>(){}.getType();
    }
    
    if ("ConditionalCancelAllBase".equalsIgnoreCase(className)) {
      return new TypeToken<ConditionalCancelAllBase>(){}.getType();
    }
    
    if ("ConditionalCancelAllRes".equalsIgnoreCase(className)) {
      return new TypeToken<ConditionalCancelAllRes>(){}.getType();
    }
    
    if ("ConditionalOrdersRes".equalsIgnoreCase(className)) {
      return new TypeToken<ConditionalOrdersRes>(){}.getType();
    }
    
    if ("ConditionalOrdersResBase".equalsIgnoreCase(className)) {
      return new TypeToken<ConditionalOrdersResBase>(){}.getType();
    }
    
    if ("ConditionalRes".equalsIgnoreCase(className)) {
      return new TypeToken<ConditionalRes>(){}.getType();
    }
    
    if ("ExtFields".equalsIgnoreCase(className)) {
      return new TypeToken<ExtFields>(){}.getType();
    }
    
    if ("FundRecordBase".equalsIgnoreCase(className)) {
      return new TypeToken<FundRecordBase>(){}.getType();
    }
    
    if ("FundingFeeBase".equalsIgnoreCase(className)) {
      return new TypeToken<FundingFeeBase>(){}.getType();
    }
    
    if ("FundingFeeRes".equalsIgnoreCase(className)) {
      return new TypeToken<FundingFeeRes>(){}.getType();
    }
    
    if ("FundingPredicted".equalsIgnoreCase(className)) {
      return new TypeToken<FundingPredicted>(){}.getType();
    }
    
    if ("FundingPredictedBase".equalsIgnoreCase(className)) {
      return new TypeToken<FundingPredictedBase>(){}.getType();
    }
    
    if ("FundingRate".equalsIgnoreCase(className)) {
      return new TypeToken<FundingRate>(){}.getType();
    }
    
    if ("FundingRateBase".equalsIgnoreCase(className)) {
      return new TypeToken<FundingRateBase>(){}.getType();
    }
    
    if ("FundingRecords".equalsIgnoreCase(className)) {
      return new TypeToken<FundingRecords>(){}.getType();
    }
    
    if ("GetRiskLimitRes".equalsIgnoreCase(className)) {
      return new TypeToken<GetRiskLimitRes>(){}.getType();
    }
    
    if ("KlineBase".equalsIgnoreCase(className)) {
      return new TypeToken<KlineBase>(){}.getType();
    }
    
    if ("KlineRes".equalsIgnoreCase(className)) {
      return new TypeToken<KlineRes>(){}.getType();
    }
    
    if ("Leverage".equalsIgnoreCase(className)) {
      return new TypeToken<Leverage>(){}.getType();
    }
    
    if ("LeverageInfo".equalsIgnoreCase(className)) {
      return new TypeToken<LeverageInfo>(){}.getType();
    }
    
    if ("LeverageResult".equalsIgnoreCase(className)) {
      return new TypeToken<LeverageResult>(){}.getType();
    }
    
    if ("LotSizeFilter".equalsIgnoreCase(className)) {
      return new TypeToken<LotSizeFilter>(){}.getType();
    }
    
    if ("OderBookRes".equalsIgnoreCase(className)) {
      return new TypeToken<OderBookRes>(){}.getType();
    }
    
    if ("OrderBookBase".equalsIgnoreCase(className)) {
      return new TypeToken<OrderBookBase>(){}.getType();
    }
    
    if ("OrderCancelAllBase".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCancelAllBase>(){}.getType();
    }
    
    if ("OrderCancelAllRes".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCancelAllRes>(){}.getType();
    }
    
    if ("OrderCancelBase".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCancelBase>(){}.getType();
    }
    
    if ("OrderListBase".equalsIgnoreCase(className)) {
      return new TypeToken<OrderListBase>(){}.getType();
    }
    
    if ("OrderListData".equalsIgnoreCase(className)) {
      return new TypeToken<OrderListData>(){}.getType();
    }
    
    if ("OrderRes".equalsIgnoreCase(className)) {
      return new TypeToken<OrderRes>(){}.getType();
    }
    
    if ("OrderResBase".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResBase>(){}.getType();
    }
    
    if ("Position".equalsIgnoreCase(className)) {
      return new TypeToken<Position>(){}.getType();
    }
    
    if ("PositionInfo".equalsIgnoreCase(className)) {
      return new TypeToken<PositionInfo>(){}.getType();
    }
    
    if ("PriceFilter".equalsIgnoreCase(className)) {
      return new TypeToken<PriceFilter>(){}.getType();
    }
    
    if ("QueryOrderBase".equalsIgnoreCase(className)) {
      return new TypeToken<QueryOrderBase>(){}.getType();
    }
    
    if ("QueryOrderRes".equalsIgnoreCase(className)) {
      return new TypeToken<QueryOrderRes>(){}.getType();
    }
    
    if ("ReplaceConditionalBase".equalsIgnoreCase(className)) {
      return new TypeToken<ReplaceConditionalBase>(){}.getType();
    }
    
    if ("ReplaceOrderBase".equalsIgnoreCase(className)) {
      return new TypeToken<ReplaceOrderBase>(){}.getType();
    }
    
    if ("RiskIDRes".equalsIgnoreCase(className)) {
      return new TypeToken<RiskIDRes>(){}.getType();
    }
    
    if ("RiskLimitBase".equalsIgnoreCase(className)) {
      return new TypeToken<RiskLimitBase>(){}.getType();
    }
    
    if ("RiskLimitRes".equalsIgnoreCase(className)) {
      return new TypeToken<RiskLimitRes>(){}.getType();
    }
    
    if ("ServerTime".equalsIgnoreCase(className)) {
      return new TypeToken<ServerTime>(){}.getType();
    }
    
    if ("SetRiskLimitBase".equalsIgnoreCase(className)) {
      return new TypeToken<SetRiskLimitBase>(){}.getType();
    }
    
    if ("SymbolInfo".equalsIgnoreCase(className)) {
      return new TypeToken<SymbolInfo>(){}.getType();
    }
    
    if ("SymbolInfoBase".equalsIgnoreCase(className)) {
      return new TypeToken<SymbolInfoBase>(){}.getType();
    }
    
    if ("SymbolTickInfo".equalsIgnoreCase(className)) {
      return new TypeToken<SymbolTickInfo>(){}.getType();
    }
    
    if ("Symbols".equalsIgnoreCase(className)) {
      return new TypeToken<Symbols>(){}.getType();
    }
    
    if ("TradeRecords".equalsIgnoreCase(className)) {
      return new TypeToken<TradeRecords>(){}.getType();
    }
    
    if ("TradeRecordsBase".equalsIgnoreCase(className)) {
      return new TypeToken<TradeRecordsBase>(){}.getType();
    }
    
    if ("TradeRecordsInfo".equalsIgnoreCase(className)) {
      return new TypeToken<TradeRecordsInfo>(){}.getType();
    }
    
    if ("TradingStopBase".equalsIgnoreCase(className)) {
      return new TypeToken<TradingStopBase>(){}.getType();
    }
    
    if ("TradingStopRes".equalsIgnoreCase(className)) {
      return new TypeToken<TradingStopRes>(){}.getType();
    }
    
    if ("WithdrawBalance".equalsIgnoreCase(className)) {
      return new TypeToken<WithdrawBalance>(){}.getType();
    }
    
    if ("WithdrawBalanceBase".equalsIgnoreCase(className)) {
      return new TypeToken<WithdrawBalanceBase>(){}.getType();
    }
    
    if ("WithdrawRecords".equalsIgnoreCase(className)) {
      return new TypeToken<WithdrawRecords>(){}.getType();
    }
    
    if ("WithdrawResBase".equalsIgnoreCase(className)) {
      return new TypeToken<WithdrawResBase>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
