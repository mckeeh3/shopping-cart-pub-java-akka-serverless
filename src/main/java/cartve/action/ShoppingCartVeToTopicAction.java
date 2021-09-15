/* This code was generated by Akka Serverless tooling.
 * As long as this file exists it will not be re-generated.
 * You are free to make changes to this file.
 */

package cartve.action;

import com.akkaserverless.javasdk.action.ActionCreationContext;

public class ShoppingCartVeToTopicAction extends AbstractShoppingCartVeToTopicAction {
  public ShoppingCartVeToTopicAction(ActionCreationContext creationContext) {
  }

  @Override
  public Effect<ShoppingCartVeActionTopicOut.AddLineItem> addItem(ShoppingCartVeActionTopicOut.AddLineItem addLineItem) {
    return effects().reply(addLineItem);
  }

  @Override
  public Effect<ShoppingCartVeActionTopicOut.ChangeLineItemQuantity> changeItem(ShoppingCartVeActionTopicOut.ChangeLineItemQuantity changeLineItemQuantity) {
    return effects().reply(changeLineItemQuantity);
  }

  @Override
  public Effect<ShoppingCartVeActionTopicOut.RemoveLineItem> removeItem(ShoppingCartVeActionTopicOut.RemoveLineItem removeLineItem) {
    return effects().reply(removeLineItem);
  }

  @Override
  public Effect<ShoppingCartVeActionTopicOut.CheckoutShoppingCart> checkoutCart(ShoppingCartVeActionTopicOut.CheckoutShoppingCart checkoutShoppingCart) {
    return effects().reply(checkoutShoppingCart);
  }

  @Override
  public Effect<ShoppingCartVeActionTopicOut.RemoveShoppingCart> removeCart(ShoppingCartVeActionTopicOut.RemoveShoppingCart removeShoppingCart) {
    return effects().reply(removeShoppingCart);
  }
}