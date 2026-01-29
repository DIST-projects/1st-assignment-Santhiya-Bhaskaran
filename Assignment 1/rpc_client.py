import xmlrpc.client

# ----------------------------------------
# Connect to the XML-RPC server hosted on AWS EC2
# Replace IP address with your EC2 public IP if it changes
# Port 8000 must be open in the EC2 security group
# ----------------------------------------
server = xmlrpc.client.ServerProxy("http://3.110.159.172:8000/")

try:
    # ----------------------------------------
    # Input string to be processed remotely
    # ----------------------------------------
    text = "Distributed Systems"

    # ----------------------------------------
    # Display original input
    # ----------------------------------------
    print("Original Text:", text)

    # ----------------------------------------
    # Call remote procedure to convert string to uppercase
    # ----------------------------------------
    print("Uppercase:", server.to_upper(text))

    # ----------------------------------------
    # Call remote procedure to reverse the string
    # ----------------------------------------
    print("Reversed:", server.reverse_string(text))

    # ----------------------------------------
    # Call remote procedure to get string length
    # ----------------------------------------
    print("Length:", server.string_length(text))

except Exception as e:
    # ----------------------------------------
    # Handle connection or RPC errors
    # ----------------------------------------
    print("Client Error:", e)
