# OnlineStockBrokerageSystem

We will focus on the following set of requirements while designing the online stock brokerage system:

1) Any user of our system should be able to buy and sell stocks.

2) Any user can have multiple watchlists containing multiple stock quotes.

3) Users should be able to place stock trade orders of the following types: 1) market, 2) limit, 3) stop loss and, 4) stop limit.

4) Users can have multiple ‘lots’ of a stock. This means that if a user has bought a stock multiple times, the system should be able to differentiate between different lots of the same stock.

5) The system should be able to generate reports for quarterly updates and yearly tax statements.

6) Users should be able to deposit and withdraw money either via check, wire, or electronic bank transfer.

7) The system should be able to send notifications whenever trade orders are executed.

Usecase diagram

We have three main Actors in our system:

Admin: Mainly responsible for administrative functions like blocking or unblocking members.

Member: All members can search the stock inventory, as well as buy and sell stocks. Members can have multiple watchlists containing multiple stock quotes.

System: Mainly responsible for sending notifications for stock orders and periodically fetching stock quotes from the stock exchange.

Here are the top use cases of the Stock Brokerage System:

Register new account/Cancel membership: To add a new member or cancel the membership of an existing member.

Add/Remove/Edit watchlist: To add, remove or modify a watchlist.

Search stock inventory: To search for stocks by their symbols.

Place order: To place a buy or sell order on the stock exchange.

Cancel order: Cancel an already placed order.

Deposit/Withdraw money: Members can deposit or withdraw money via check, wire or electronic bank transfer.
