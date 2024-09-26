int getDays(int sec)
{
  return sec / 86400;
}
int getHours(int sec)
{
  return (sec % 86400) / 3600;
}
int getMinutes(int sec)
{
  return (sec % 3600) / 60;
}
int getSeconds(int sec)
{
  return sec % 60;
}
