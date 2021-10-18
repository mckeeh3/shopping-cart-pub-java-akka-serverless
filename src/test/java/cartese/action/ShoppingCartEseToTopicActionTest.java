package cartese.action;

import akka.stream.javadsl.Source;
import cartese.action.ShoppingCartEseActionTopicOut;
import cartese.action.ShoppingCartEseToTopicAction;
import cartese.action.ShoppingCartEseToTopicActionTestKit;
import com.akkaserverless.javasdk.testkit.ActionResult;
import org.junit.Test;
import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class ShoppingCartEseToTopicActionTest {

  @Test
  public void exampleTest() {
    ShoppingCartEseToTopicActionTestKit testKit = ShoppingCartEseToTopicActionTestKit.of(ShoppingCartEseToTopicAction::new);
    // use the testkit to execute a command
    // ActionResult<SomeResponse> result = testKit.someOperation(SomeRequest);
    // verify the response
    // SomeResponse actualResponse = result.getReply();
    // assertEquals(expectedResponse, actualResponse);
  }

  @Test
  public void addItemTest() {
    ShoppingCartEseToTopicActionTestKit testKit = ShoppingCartEseToTopicActionTestKit.of(ShoppingCartEseToTopicAction::new);
    // ActionResult<ShoppingCartEseActionTopicOut.AddLineItem> result = testKit.addItem(ShoppingCartEseActionTopicOut.AddLineItem.newBuilder()...build());
  }

  @Test
  public void changeItemTest() {
    ShoppingCartEseToTopicActionTestKit testKit = ShoppingCartEseToTopicActionTestKit.of(ShoppingCartEseToTopicAction::new);
    // ActionResult<ShoppingCartEseActionTopicOut.ChangeLineItemQuantity> result = testKit.changeItem(ShoppingCartEseActionTopicOut.ChangeLineItemQuantity.newBuilder()...build());
  }

  @Test
  public void removeItemTest() {
    ShoppingCartEseToTopicActionTestKit testKit = ShoppingCartEseToTopicActionTestKit.of(ShoppingCartEseToTopicAction::new);
    // ActionResult<ShoppingCartEseActionTopicOut.RemoveLineItem> result = testKit.removeItem(ShoppingCartEseActionTopicOut.RemoveLineItem.newBuilder()...build());
  }

  @Test
  public void checkoutCartTest() {
    ShoppingCartEseToTopicActionTestKit testKit = ShoppingCartEseToTopicActionTestKit.of(ShoppingCartEseToTopicAction::new);
    // ActionResult<ShoppingCartEseActionTopicOut.CheckoutShoppingCart> result = testKit.checkoutCart(ShoppingCartEseActionTopicOut.CheckoutShoppingCart.newBuilder()...build());
  }

  @Test
  public void removeCartTest() {
    ShoppingCartEseToTopicActionTestKit testKit = ShoppingCartEseToTopicActionTestKit.of(ShoppingCartEseToTopicAction::new);
    // ActionResult<ShoppingCartEseActionTopicOut.RemoveShoppingCart> result = testKit.removeCart(ShoppingCartEseActionTopicOut.RemoveShoppingCart.newBuilder()...build());
  }

}
