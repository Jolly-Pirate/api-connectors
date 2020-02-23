/* 
 * Bybit API
 *
 * ## REST API for the Bybit Exchange. Base URI: [https://api-testnet.bybit.com]  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using IO.Swagger.Api;
using IO.Swagger.Model;
using IO.Swagger.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing PositionInfo
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class PositionInfoTests
    {
        // TODO uncomment below to declare an instance variable for PositionInfo
        //private PositionInfo instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of PositionInfo
            //instance = new PositionInfo();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PositionInfo
        /// </summary>
        [Test]
        public void PositionInfoInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" PositionInfo
            //Assert.IsInstanceOfType<PositionInfo> (instance, "variable 'instance' is a PositionInfo");
        }


        /// <summary>
        /// Test the property 'Id'
        /// </summary>
        [Test]
        public void IdTest()
        {
            // TODO unit test for the property 'Id'
        }
        /// <summary>
        /// Test the property 'UserId'
        /// </summary>
        [Test]
        public void UserIdTest()
        {
            // TODO unit test for the property 'UserId'
        }
        /// <summary>
        /// Test the property 'RiskId'
        /// </summary>
        [Test]
        public void RiskIdTest()
        {
            // TODO unit test for the property 'RiskId'
        }
        /// <summary>
        /// Test the property 'Symbol'
        /// </summary>
        [Test]
        public void SymbolTest()
        {
            // TODO unit test for the property 'Symbol'
        }
        /// <summary>
        /// Test the property 'Side'
        /// </summary>
        [Test]
        public void SideTest()
        {
            // TODO unit test for the property 'Side'
        }
        /// <summary>
        /// Test the property 'Size'
        /// </summary>
        [Test]
        public void SizeTest()
        {
            // TODO unit test for the property 'Size'
        }
        /// <summary>
        /// Test the property 'PositionValue'
        /// </summary>
        [Test]
        public void PositionValueTest()
        {
            // TODO unit test for the property 'PositionValue'
        }
        /// <summary>
        /// Test the property 'EntryPrice'
        /// </summary>
        [Test]
        public void EntryPriceTest()
        {
            // TODO unit test for the property 'EntryPrice'
        }
        /// <summary>
        /// Test the property 'Leverage'
        /// </summary>
        [Test]
        public void LeverageTest()
        {
            // TODO unit test for the property 'Leverage'
        }
        /// <summary>
        /// Test the property 'AutoAddMargin'
        /// </summary>
        [Test]
        public void AutoAddMarginTest()
        {
            // TODO unit test for the property 'AutoAddMargin'
        }
        /// <summary>
        /// Test the property 'PositionMargin'
        /// </summary>
        [Test]
        public void PositionMarginTest()
        {
            // TODO unit test for the property 'PositionMargin'
        }
        /// <summary>
        /// Test the property 'LiqPrice'
        /// </summary>
        [Test]
        public void LiqPriceTest()
        {
            // TODO unit test for the property 'LiqPrice'
        }
        /// <summary>
        /// Test the property 'BustPrice'
        /// </summary>
        [Test]
        public void BustPriceTest()
        {
            // TODO unit test for the property 'BustPrice'
        }
        /// <summary>
        /// Test the property 'OccClosingFee'
        /// </summary>
        [Test]
        public void OccClosingFeeTest()
        {
            // TODO unit test for the property 'OccClosingFee'
        }
        /// <summary>
        /// Test the property 'OccFundingFee'
        /// </summary>
        [Test]
        public void OccFundingFeeTest()
        {
            // TODO unit test for the property 'OccFundingFee'
        }
        /// <summary>
        /// Test the property 'TakeProfit'
        /// </summary>
        [Test]
        public void TakeProfitTest()
        {
            // TODO unit test for the property 'TakeProfit'
        }
        /// <summary>
        /// Test the property 'StopLoss'
        /// </summary>
        [Test]
        public void StopLossTest()
        {
            // TODO unit test for the property 'StopLoss'
        }
        /// <summary>
        /// Test the property 'PositionStatus'
        /// </summary>
        [Test]
        public void PositionStatusTest()
        {
            // TODO unit test for the property 'PositionStatus'
        }
        /// <summary>
        /// Test the property 'DeleverageIndicator'
        /// </summary>
        [Test]
        public void DeleverageIndicatorTest()
        {
            // TODO unit test for the property 'DeleverageIndicator'
        }
        /// <summary>
        /// Test the property 'OcCalcData'
        /// </summary>
        [Test]
        public void OcCalcDataTest()
        {
            // TODO unit test for the property 'OcCalcData'
        }
        /// <summary>
        /// Test the property 'OrderMargin'
        /// </summary>
        [Test]
        public void OrderMarginTest()
        {
            // TODO unit test for the property 'OrderMargin'
        }
        /// <summary>
        /// Test the property 'WalletBalance'
        /// </summary>
        [Test]
        public void WalletBalanceTest()
        {
            // TODO unit test for the property 'WalletBalance'
        }
        /// <summary>
        /// Test the property 'UnrealisedPnl'
        /// </summary>
        [Test]
        public void UnrealisedPnlTest()
        {
            // TODO unit test for the property 'UnrealisedPnl'
        }
        /// <summary>
        /// Test the property 'RealisedPnl'
        /// </summary>
        [Test]
        public void RealisedPnlTest()
        {
            // TODO unit test for the property 'RealisedPnl'
        }
        /// <summary>
        /// Test the property 'CumRealisedPnl'
        /// </summary>
        [Test]
        public void CumRealisedPnlTest()
        {
            // TODO unit test for the property 'CumRealisedPnl'
        }
        /// <summary>
        /// Test the property 'CumCommission'
        /// </summary>
        [Test]
        public void CumCommissionTest()
        {
            // TODO unit test for the property 'CumCommission'
        }
        /// <summary>
        /// Test the property 'CrossSeq'
        /// </summary>
        [Test]
        public void CrossSeqTest()
        {
            // TODO unit test for the property 'CrossSeq'
        }
        /// <summary>
        /// Test the property 'PositionSeq'
        /// </summary>
        [Test]
        public void PositionSeqTest()
        {
            // TODO unit test for the property 'PositionSeq'
        }
        /// <summary>
        /// Test the property 'CreatedAt'
        /// </summary>
        [Test]
        public void CreatedAtTest()
        {
            // TODO unit test for the property 'CreatedAt'
        }
        /// <summary>
        /// Test the property 'UpdatedAt'
        /// </summary>
        [Test]
        public void UpdatedAtTest()
        {
            // TODO unit test for the property 'UpdatedAt'
        }

    }

}
