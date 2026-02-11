from xmlrpc.server import SimpleXMLRPCServer

# -------------------------------
# Remote procedure: Convert string to uppercase
# This function will be called remotely by the RPC client
# -------------------------------
def to_upper(text):
    return text.upper()

# -------------------------------
# Remote procedure: Reverse a string
# Returns the reversed version of the input text
# -------------------------------
def reverse_string(text):
    return text[::-1]

# -------------------------------
# Remote procedure: Find length of a string
# Returns the number of characters in the string
# -------------------------------
def string_length(text):
    return len(text)

# -------------------------------
# Create XML-RPC server
# "0.0.0.0" allows access from any external machine (AWS EC2)
# Port 8000 is used for RPC communication
# -------------------------------
server = SimpleXMLRPCServer(("0.0.0.0", 8000))
print("RPC String Server running on port 8000...")

# -------------------------------
# Register functions so clients can call them remotely
# -------------------------------
server.register_function(to_upper, "to_upper")
server.register_function(reverse_string, "reverse_string")
server.register_function(string_length, "string_length")

# -------------------------------
# Start the server and keep it running
# Server stops safely when interrupted (Ctrl + C)
# -------------------------------
try:
    server.serve_forever()
except KeyboardInterrupt:
    print("Server stopped.")
