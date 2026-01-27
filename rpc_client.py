import xmlrpc.client

# Create a proxy object to connect to the RPC server
# The server is hosted on an AWS EC2 instance and listens on port 8000
server = xmlrpc.client.ServerProxy("http://13.233.108.133:8000/")

try:
    # Invoke the remote add procedure on the server
    print("Addition Result:", server.add(5, 3))

    # Invoke the remote multiply procedure on the server
    print("Multiplication Result:", server.multiply(4, 6))

except Exception as e:
    # Handle any errors such as connection failure or server-side issues
    print("Error:", e)
