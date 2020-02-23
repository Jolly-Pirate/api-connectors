//
// WithdrawBalance.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Get wallet balance response */

public struct WithdrawBalance: Codable {

    public var equity: Double?
    public var availableBalance: Double?
    public var usedMargin: Double?
    public var orderMargin: Double?
    public var positionMargin: Double?
    public var occClosingFee: Double?
    public var occFundingFee: Double?
    public var walletBalance: Double?
    public var realisedPnl: Double?
    public var unrealisedPnl: Double?
    public var cumRealisedPnl: Double?
    public var givenCash: Double?
    public var serviceCash: Double?

    public init(equity: Double?, availableBalance: Double?, usedMargin: Double?, orderMargin: Double?, positionMargin: Double?, occClosingFee: Double?, occFundingFee: Double?, walletBalance: Double?, realisedPnl: Double?, unrealisedPnl: Double?, cumRealisedPnl: Double?, givenCash: Double?, serviceCash: Double?) {
        self.equity = equity
        self.availableBalance = availableBalance
        self.usedMargin = usedMargin
        self.orderMargin = orderMargin
        self.positionMargin = positionMargin
        self.occClosingFee = occClosingFee
        self.occFundingFee = occFundingFee
        self.walletBalance = walletBalance
        self.realisedPnl = realisedPnl
        self.unrealisedPnl = unrealisedPnl
        self.cumRealisedPnl = cumRealisedPnl
        self.givenCash = givenCash
        self.serviceCash = serviceCash
    }

    public enum CodingKeys: String, CodingKey { 
        case equity
        case availableBalance = "available_balance"
        case usedMargin = "used_margin"
        case orderMargin = "order_margin"
        case positionMargin = "position_margin"
        case occClosingFee = "occ_closing_fee"
        case occFundingFee = "occ_funding_fee"
        case walletBalance = "wallet_balance"
        case realisedPnl = "realised_pnl"
        case unrealisedPnl = "unrealised_pnl"
        case cumRealisedPnl = "cum_realised_pnl"
        case givenCash = "given_cash"
        case serviceCash = "service_cash"
    }


}

