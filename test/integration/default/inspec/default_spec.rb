describe port(8080) do
  it { should be_listening }
  #its('processes') {should include 'syslog'}
end
