require_relative 'lib/frequency'

frequencies = []
File.open('input.txt', 'r') do |f|
  while line = f.gets
    i = Integer line
    frequencies << i
  end
end

puts Frequency.find_first_repeat(frequencies)
