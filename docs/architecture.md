# EventEase architecture

EventEase is organized around an event lifecycle: publish, discover, register, and cancel. Domain rules stay independent of HTTP and database details so capacity and timing decisions can be tested without a running browser.

The first slice is deliberately small: an event aggregate, a health endpoint, a migration, and a test seam. Future adapters can add authentication and notifications without changing core event rules.
