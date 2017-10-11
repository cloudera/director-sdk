
Cloudera Director Python API Client
===================================

This repository contains the source of the Cloudera Director python-client that can be used to
interact with the Director server API. This can be used to bootstrap, grow, shrink and
terminate CDH clusters managed by Cloudera Manager on a cloud infrastructure.

Getting Started
---------------

The Python client is available from PyPI and it can be installed like this:

    pip install cloudera-director-python-client


Basic Usage
-----------

Let's go through a quick example that shows how to list all of the environments:

```python
from cloudera.director.common.client import ApiClient
from cloudera.director.latest import AuthenticationApi, EnvironmentsApi
from cloudera.director.latest.models import Login

# Cloudera Director server runs at http://127.0.0.1:7189

client = ApiClient("http://localhost:7189")

AuthenticationApi(client).login(Login(username="admin", password="admin"))
# <cloudera.director.latest.models.User.User instance at 0x101c87998>

EnvironmentsApi(client).list()
# ['AWS-1']
```

Another example on how to create and delete a user account:

```python
from cloudera.director.latest.models import Login, User
from cloudera.director.common.client import ApiClient
from cloudera.director.latest import AuthenticationApi, UsersApi

# Cloudera Director server runs at http://127.0.0.1:7189

client = ApiClient("http://localhost:7189")

AuthenticationApi(client).login(Login(username="admin", password="admin"))
# <cloudera.director.latest.models.User.User instance at 0x10219c488>

users =  UsersApi(client)
newUser = User()
newUser.username = "user1"
newUser.password = "pass1"
newUser.enabled = True
newUser.roles = set(["ROLE_READONLY"])
users.create(newUser)
users.list()
# ['admin', 'guest', 'user1']

users.delete("user1")
users.list()
# ['admin', 'guest']
```

TLS
---

The client automatically supports communicating with the Cloudera Director
server over TLS when the server URL begins with "https". Pass the path to a
file containing trusted certificates (either for the server itself or for a
relevant CA) to the client constructor for successful certificate verification.

TLS support requires Python 2.7.9 or higher.

More samples
------------

You can find more code examples under the `python-client-samples` directory.








