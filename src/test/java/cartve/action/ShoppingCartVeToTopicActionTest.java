package cartve.action;

import akka.stream.javadsl.Source;
import cartve.action.ShoppingCartVeActionTopicOut;
import cartve.action.ShoppingCartVeToTopicAction;
import cartve.action.ShoppingCartVeToTopicActionTestKit;
import com.akkaserverless.javasdk.testkit.ActionResult;
import org.junit.Test;
import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class ShoppingCartVeToTopicActionTest {

  @Test
  public void exampleTest() {
    ShoppingCartVeToTopicActionTestKit testKit = ShoppingCartVeToTopicActionTestKit.of(ShoppingCartVeToTopicAction::new);
    // use the testkit to execute a command
    // ActionResult<SomeResponse> result = testKit.someOperation(SomeRequest);
    // verify the response
    // SomeResponse actualResponse = result.getReply();
    // assertEquals(expectedResponse, actualResponse);
  }

  @Test
  public void addItemTest() {
    ShoppingCartVeToTopicActionTestKit testKit = ShoppingCartVeToTopicActionTestKit.of(ShoppingCartVeToTopicAction::new);
    // ActionResult<ShoppingCartVeActionTopicOut.AddLineItem> result = testKit.addItem(ShoppingCartVeActionTopicOut.AddLineItem.newBuilder()...build());
  }

  @Test
  public void changeItemTest() {
    ShoppingCartVeToTopicActionTestKit testKit = ShoppingCartVeToTopicActionTestKit.of(ShoppingCartVeToTopicAction::new);
    // ActionResult<ShoppingCartVeActionTopicOut.ChangeLineItemQuantity> result = testKit.changeItem(ShoppingCartVeActionTopicOut.ChangeLineItemQuantity.newBuilder()...build());
  }

  @Test
  public void removeItemTest() {
    ShoppingCartVeToTopicActionTestKit testKit = ShoppingCartVeToTopicActionTestKit.of(ShoppingCartVeToTopicAction::new);
    // ActionResult<ShoppingCartVeActionTopicOut.RemoveLineItem> result = testKit.removeItem(ShoppingCartVeActionTopicOut.RemoveLineItem.newBuilder()...build());
  }

  @Test
  public void checkoutCartTest() {
    ShoppingCartVeToTopicActionTestKit testKit = ShoppingCartVeToTopicActionTestKit.of(ShoppingCartVeToTopicAction::new);
    // ActionResult<ShoppingCartVeActionTopicOut.CheckoutShoppingCart> result = testKit.checkoutCart(ShoppingCartVeActionTopicOut.CheckoutShoppingCart.newBuilder()...build());
  }

  @Test
  public void removeCartTest() {
    ShoppingCartVeToTopicActionTestKit testKit = ShoppingCartVeToTopicActionTestKit.of(ShoppingCartVeToTopicAction::new);
    // ActionResult<ShoppingCartVeActionTopicOut.RemoveShoppingCart> result = testKit.removeCart(ShoppingCartVeActionTopicOut.RemoveShoppingCart.newBuilder()...build());
  }

}
