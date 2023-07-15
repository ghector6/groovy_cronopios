@Grab(group='org.apache.httpcomponents', module='httpclient', version='4.3.6')
import org.apache.http.impl.client.HttpClients
import org.apache.http.client.methods.HttpGet

def httpclient = HttpClients.createDefault()
def httpGet = new HttpGet('https://github.com/ghector6')
def response= httpclient.execute(httpGet)

println response.getStatusLine()
