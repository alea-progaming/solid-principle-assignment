## Problem

1. Multiple Responsibilities: The Order interface is responsible for multiple tasks such as calculating total price, placing an order, generating an invoice, and sending an email notification. This design makes the Order interface and its implementation, OrderAction, prone to changes for various reasons — for instance, changes in how orders are placed, how totals are calculated, or how notifications are sent.

2. Lack of Cohesion: Methods like generateInvoice and sendEmailNotification are not necessarily related to the core responsibility of managing an order's lifecycle. Their inclusion in the Order interface leads to low cohesion where the class does more than what its main responsibility should be.
To adhere to the Single Responsibility Principle, you could refactor the design as follows:

Separate Interfaces for Different Responsibilities:
- An interface for managing the lifecycle of an order.
- An interface for notification handling.
- An interface for invoice management.
- An interface for calculating total.
- Implementation Classes for Each Responsibility:
- Implement each responsibility in separate classes to ensure that changes in one aspect of the system do not affect others.

## Refer to the UML Class Diagram
![SOLID_PURUGGANAN](https://github.com/alea-progaming/solid-principle-assignment/assets/110019094/36852379-010d-4262-b130-c19d2c40d403)
